// Implementation class for the CartService interface handling shopping cart operations
package com.assessment.ecommerce.service.impl;

import com.assessment.ecommerce.service.ecommerceService.CartService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {

    // Internal storage for the shopping cart, using a Map with item names as keys and prices as values
    private final Map<String, Double> cart = new HashMap<>();

    /**
     * Adds an item to the shopping cart.
     *
     * @param itemName Name of the item to be added.
     * @param price    Price of the item to be added.
     */
    @Override
    public void addItemToCart(String itemName, double price) {
        cart.put(itemName, price);
    }

    /**
     * Retrieves the current items in the shopping cart.
     *
     * @return A Map representing the items in the cart, where keys are item names and values are item prices.
     */
    @Override
    public Map<String, Double> getCart() {
        return cart;
    }

    /**
     * Clears all items from the shopping cart.
     */
    @Override
    public void clearCart() {
        cart.clear();
    }
}
