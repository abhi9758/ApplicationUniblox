package com.assessment.ecommerce.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.assessment.ecommerce.model.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {OrderServiceImpl.class})
@ExtendWith(SpringExtension.class)
class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderServiceImpl;

    /**
     * Method under test: {@link OrderServiceImpl#checkout(Map)}
     */
    @Test
    void testCheckout() {
        // Arrange
        HashMap<String, Double> cart = new HashMap<>();

        // Act
        Order actualCheckoutResult = orderServiceImpl.checkout(cart);

        // Assert
        assertEquals("DISCOUNT_1", orderServiceImpl.getDiscountCodes().get(0));
        assertEquals(0.0d, actualCheckoutResult.getDiscountAmount());
        assertEquals(0.0d, actualCheckoutResult.getTotalAmount());
        assertTrue(cart.isEmpty());
        assertTrue(actualCheckoutResult.getItems().isEmpty());
    }

    /**
     * Method under test: {@link OrderServiceImpl#checkout(Map)}
     */
    @Test
    void testCheckout2() {
        // Arrange
        HashMap<String, Double> cart = new HashMap<>();
        cart.put("foo", 0.1d);

        // Act
        Order actualCheckoutResult = orderServiceImpl.checkout(cart);

        // Assert
        assertNull(actualCheckoutResult.getDiscountCode());
        assertEquals(0.0d, actualCheckoutResult.getDiscountAmount());
        assertEquals(0.1d, actualCheckoutResult.getTotalAmount());
        assertEquals(1, actualCheckoutResult.getItems().size());
        assertTrue(cart.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link OrderServiceImpl#getDiscountCodes()}
     *   <li>{@link OrderServiceImpl#getOrders()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();

        // Act
        List<String> actualDiscountCodes = orderServiceImpl.getDiscountCodes();

        // Assert
        assertEquals(actualDiscountCodes, orderServiceImpl.getOrders());
    }
}
