package com.assessment.WeatherApp.service.ecommerceService;

import com.assessment.WeatherApp.model.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    Order checkout(Map<String, Double> cart);
    List<Order> getOrders();
    List<String> getDiscountCodes();
}
