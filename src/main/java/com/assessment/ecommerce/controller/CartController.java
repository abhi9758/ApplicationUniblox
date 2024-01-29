// Controller class for handling cart-related operations
package com.assessment.ecommerce.controller;

import com.assessment.ecommerce.model.Item;
import com.assessment.ecommerce.service.ecommerceService.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cart")
public class CartController {

    // Auto wiring the CartService for cart-related business logic
    @Autowired
    private CartService cartService;

    // Endpoint for adding an item to the cart using a POST request
    @PostMapping("/add")
    public void addItemToCart(@RequestBody Item item) {
        // Delegate the item addition to the CartService
        cartService.addItemToCart(item.getName(), item.getPrice());
    }

    // Endpoint for retrieving the current items in the cart using a GET request
    @GetMapping("/get")
    public Map<String, Double> getCart() {
        // Retrieve and return the current items in the cart using the CartService
        return cartService.getCart();
    }
}
