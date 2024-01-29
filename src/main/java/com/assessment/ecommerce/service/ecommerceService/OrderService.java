// Interface defining the OrderService contract for handling order-related operations
package com.assessment.ecommerce.service.ecommerceService;

import com.assessment.ecommerce.model.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {

    /**
     * Processes the checkout, creating an order based on the provided cart information.
     *
     * @param cart A Map representing the items in the cart, where keys are item names and values are item prices.
     * @return An Order object representing the completed order.
     */
    Order checkout(Map<String, Double> cart);

    /**
     * Retrieves a list of all orders.
     *
     * @return A List<Order> containing information about all orders.
     */
    List<Order> getOrders();

    /**
     * Retrieves a list of available discount codes.
     *
     * @return A List<String> containing available discount codes.
     */
    List<String> getDiscountCodes();
}
