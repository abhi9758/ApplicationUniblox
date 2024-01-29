package com.assessment.ecommerce.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CartServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CartServiceImplDiffblueTest {
    @Autowired
    private CartServiceImpl cartServiceImpl;

    /**
     * Method under test: {@link CartServiceImpl#addItemToCart(String, double)}
     */
    @Test
    void testAddItemToCart() {
        // Arrange and Act
        cartServiceImpl.addItemToCart("Item Name", 10.0d);

        // Assert
        assertEquals(1, cartServiceImpl.getCart().size());
    }

    /**
     * Method under test: {@link CartServiceImpl#getCart()}
     */
    @Test
    void testGetCart() {
        // Arrange, Act and Assert
        assertTrue((new CartServiceImpl()).getCart().isEmpty());
    }

    /**
     * Method under test: {@link CartServiceImpl#clearCart()}
     */
    @Test
    void testClearCart() {
        // Arrange and Act
        cartServiceImpl.clearCart();

        // Assert
        assertTrue(cartServiceImpl.getCart().isEmpty());
    }
}
