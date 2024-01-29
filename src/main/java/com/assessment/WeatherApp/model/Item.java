package com.assessment.WeatherApp.model;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Builder
public class Item {
    private String name;
    private double price;
//    public Item(double price,String name) {
//        this.price = price;
//        this.name = name;
//    }

   public Item()
   {

   }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}