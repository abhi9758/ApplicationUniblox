package com.assessment.ecommerce.controller;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import com.assessment.ecommerce.model.Item;
import com.assessment.ecommerce.service.ecommerceService.CartService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CartController.class})
@ExtendWith(SpringExtension.class)
class CartControllerDiffblueTest {
    @Autowired
    private CartController cartController;

    @MockBean
    private CartService cartService;

    /**
     * Method under test: {@link CartController#addItemToCart(Item)}
     */
    @Test
    void testAddItemToCart() throws Exception {
        // Arrange
        doNothing().when(cartService).addItemToCart(Mockito.<String>any(), anyDouble());

        Item item = new Item();
        item.setName("Name");
        item.setPrice(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(item);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/cart/add")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);

        // Act and Assert
        MockMvcBuilders.standaloneSetup(cartController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * Method under test: {@link CartController#getCart()}
     */
    @Test
    void testGetCart() throws Exception {
        // Arrange
        when(cartService.getCart()).thenReturn(new HashMap<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/cart/get");

        // Act and Assert
        MockMvcBuilders.standaloneSetup(cartController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{}"));
    }
}
