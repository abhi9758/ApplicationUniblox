package com.assessment.WeatherApp.service.impl;

import com.assessment.WeatherApp.service.ecommerceService.CartService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {
    private final Map<String, Double> cart = new HashMap<>();

    @Override
    public void addItemToCart(String itemName, double price) {
        cart.put(itemName, price);
    }

    @Override
    public Map<String, Double> getCart() {
        return cart;
    }

    @Override
    public void clearCart() {
        cart.clear();
    }

}
