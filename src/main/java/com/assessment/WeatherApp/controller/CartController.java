package com.assessment.WeatherApp.controller;

import com.assessment.WeatherApp.model.Item;
import com.assessment.WeatherApp.service.ecommerceService.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public void addItemToCart(@RequestBody Item item) {
        cartService.addItemToCart(item.getName(), item.getPrice());
    }

    @GetMapping("/get")
    public Map<String, Double> getCart() {
        return cartService.getCart();
    }
}
