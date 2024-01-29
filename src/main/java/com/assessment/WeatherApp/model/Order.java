package com.assessment.WeatherApp.model;

import lombok.*;

import java.util.List;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Builder
public class Order {

    private List<String> items;
    private double totalAmount;
    private String discountCode;
    private double discountAmount;

//    public Order(List<String> items) {
//        this.items = items;
//    }
//
//    public Order(String discountCode) {
//        this.discountCode = discountCode;
//    }
//
//    public Order(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }

    public Order() {
    }
    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }


}
