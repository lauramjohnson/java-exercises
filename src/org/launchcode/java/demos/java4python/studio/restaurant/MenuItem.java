package org.launchcode.java.demos.java4python.studio.restaurant;

import java.time.LocalDateTime;

/**
 * Created by Laura on 3/13/2017.
 */
public class MenuItem {
    private String name;
    private String description;
    private Double price;
    private String category;
    private final LocalDateTime dateAdded = LocalDateTime.now();

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
