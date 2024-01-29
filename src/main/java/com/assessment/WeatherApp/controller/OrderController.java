package com.assessment.WeatherApp.controller;


import com.assessment.WeatherApp.model.Order;
import com.assessment.WeatherApp.service.ecommerceService.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Order checkout(@RequestBody Map<String, Double> cart) {
        return orderService.checkout(cart);
    }

    @GetMapping("/list")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/discount-codes")
    public List<String> getDiscountCodes() {
        return orderService.getDiscountCodes();
    }
}
