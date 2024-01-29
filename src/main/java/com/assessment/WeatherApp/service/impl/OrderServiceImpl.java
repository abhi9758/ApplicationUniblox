package com.assessment.WeatherApp.service.impl;

import com.assessment.WeatherApp.model.Order;
import com.assessment.WeatherApp.service.ecommerceService.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    private final List<Order> orders = new ArrayList<>();
    private final List<String> discountCodes = new ArrayList<>();
    private int orderCount = 0;
    private static final int DISCOUNT_FREQUENCY = 5;

    @Override
    public Order checkout(Map<String, Double> cart) {

        orderCount = cart.size();
        double totalAmount = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        String discountCode = (orderCount % DISCOUNT_FREQUENCY == 0) ? generateDiscountCode() : null;
        double discountAmount = (discountCode != null) ? totalAmount * 0.10 : 0;

        System.out.println("OrderCount is: " + orderCount);
        System.out.println("Discount Code: " + discountCode);
        System.out.println("Discount Amount: " + discountAmount);

        Order order = new Order();
        order.setItems(new ArrayList<>(cart.keySet()));
        order.setTotalAmount(totalAmount - discountAmount);
        order.setDiscountCode(discountCode);
        order.setDiscountAmount(discountAmount);

        orders.add(order);

        // Clear the cart after checkout
        cart.clear();

        return order;
    }

    private String generateDiscountCode() {
        String discountCode = "DISCOUNT_" + (discountCodes.size() + 1);
        discountCodes.add(discountCode);
        return discountCode;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public List<String> getDiscountCodes() {
        return discountCodes;
    }

}
