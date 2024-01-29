package com.assessment.WeatherApp.service.ecommerceService;

import java.util.Map;

public interface CartService {
    void addItemToCart(String itemName, double price);
    Map<String, Double> getCart();
    void clearCart();
}
