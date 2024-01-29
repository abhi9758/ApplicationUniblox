// Model class representing an Item in the e-commerce system
package com.assessment.ecommerce.model;

// Uncommented annotations (@NoArgsConstructor, @AllArgsConstructor, @Getter, @Setter, @Builder) are currently not being used

public class Item {
    // Fields representing properties of an Item
    private String name;    // Name of the item
    private double price;   // Price of the item

    // Default constructor (no-args constructor) - Uncommented to ensure default instantiation
    public Item() {
    }

    // Getter method for retrieving the price of the item
    public double getPrice() {
        return price;
    }

    // Setter method for setting the price of the item
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for retrieving the name of the item
    public String getName() {
        return name;
    }

    // Setter method for setting the name of the item
    public void setName(String name) {
        this.name = name;
    }


}
