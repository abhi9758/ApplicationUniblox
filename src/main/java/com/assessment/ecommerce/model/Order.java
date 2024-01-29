// Model class representing an Order in the e-commerce system
package com.assessment.ecommerce.model;

import java.util.List;

public class Order {
    private List<String> items;         // List of items in the order
    private double totalAmount;         // Total amount of the order
    private String discountCode;        // Discount code applied to the order
    private double discountAmount;      // Discount amount applied to the order

    // Default constructor (no-args constructor) - Uncommented to ensure default instantiation
    public Order() {
    }

    // Getter method for retrieving the discount code applied to the order
    public String getDiscountCode() {
        return discountCode;
    }

    // Setter method for setting the discount code applied to the order
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    // Getter method for retrieving the discount amount applied to the order
    public double getDiscountAmount() {
        return discountAmount;
    }

    // Setter method for setting the discount amount applied to the order
    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    // Getter method for retrieving the total amount of the order
    public double getTotalAmount() {
        return totalAmount;
    }

    // Setter method for setting the total amount of the order
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Getter method for retrieving the list of items in the order
    public List<String> getItems() {
        return items;
    }

    // Setter method for setting the list of items in the order
    public void setItems(List<String> items) {
        this.items = items;
    }
}
