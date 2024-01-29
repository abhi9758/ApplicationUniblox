// Interface defining the CartService contract for handling shopping cart operations
package com.assessment.ecommerce.service.ecommerceService;

import java.util.Map;

public interface CartService {

    /**
     * Adds an item to the shopping cart.
     *
     * @param itemName Name of the item to be added.
     * @param price    Price of the item to be added.
     */
    void addItemToCart(String itemName, double price);

    /**
     * Retrieves the current items in the shopping cart.
     *
     * @return A Map representing the items in the cart, where keys are item names and values are item prices.
     */
    Map<String, Double> getCart();

    /**
     * Clears all items from the shopping cart.
     */
    void clearCart();
}
