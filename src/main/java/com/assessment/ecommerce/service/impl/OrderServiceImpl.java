// Implementation class for the OrderService interface handling order-related operations
package com.assessment.ecommerce.service.impl;

import com.assessment.ecommerce.model.Order;
import com.assessment.ecommerce.service.ecommerceService.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    // Internal storage for orders and discount codes
    private final List<Order> orders = new ArrayList<>();
    private final List<String> discountCodes = new ArrayList<>();

    // Counter for tracking the number of orders
    private int orderCount = 0;

    // Frequency at which a discount is applied
    private static final int DISCOUNT_FREQUENCY = 5;

    /**
     * Processes the checkout, creating an order based on the provided cart information.
     *
     * @param cart A Map representing the items in the cart, where keys are item names and values are item prices.
     * @return An Order object representing the completed order.
     */
    @Override
    public Order checkout(Map<String, Double> cart) {

        // Update the order count and calculate total amount
        orderCount = cart.size();
        double totalAmount = cart.values().stream().mapToDouble(Double::doubleValue).sum();

        // Determine if a discount should be applied
        String discountCode = (orderCount % DISCOUNT_FREQUENCY == 0) ? generateDiscountCode() : null;
        double discountAmount = (discountCode != null) ? totalAmount * 0.10 : 0;

        // Create the order object
        Order order = new Order();
        order.setItems(new ArrayList<>(cart.keySet()));
        order.setTotalAmount(totalAmount - discountAmount);
        order.setDiscountCode(discountCode);
        order.setDiscountAmount(discountAmount);

        // Add the order to the list of orders
        orders.add(order);

        // Clear the cart after checkout
        cart.clear();

        return order;
    }

    /**
     * Generates a discount code and adds it to the list of discount codes.
     *
     * @return The generated discount code.
     */
    private String generateDiscountCode() {
        String discountCode = "DISCOUNT_" + (discountCodes.size() + 1);
        discountCodes.add(discountCode);
        return discountCode;
    }

    /**
     * Retrieves a list of all orders.
     *
     * @return A List<Order> containing information about all orders.
     */
    @Override
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Retrieves a list of available discount codes.
     *
     * @return A List<String> containing available discount codes.
     */
    @Override
    public List<String> getDiscountCodes() {
        return discountCodes;
    }
}
