// Controller class for handling order-related operations
package com.assessment.ecommerce.controller;

import com.assessment.ecommerce.model.Order;
import com.assessment.ecommerce.service.ecommerceService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    // Auto wiring the OrderService for order-related business logic
    @Autowired
    private OrderService orderService;

    // Endpoint for processing checkout and creating an order using a POST request
    @PostMapping("/checkout")
    public Order checkout(@RequestBody Map<String, Double> cart) {
        // Delegates the checkout process to the OrderService, passing the cart information
        return orderService.checkout(cart);
    }

    // Endpoint for retrieving a list of all orders using a GET request
    @GetMapping("/list")
    public List<Order> getOrders() {
        // Calls the OrderService to get a list of all orders
        return orderService.getOrders();
    }

    // Endpoint for retrieving a list of available discount codes using a GET request
    @GetMapping("/discount-codes")
    public List<String> getDiscountCodes() {
        // Calls the OrderService to get a list of available discount codes
        return orderService.getDiscountCodes();
    }
}
