package com.example.restaurantreviews;

import java.util.Objects;

public class Restaurant {
    private String name;
    private String location;
    private int rating;
    private boolean delivery;
    private int price;

    public Restaurant() {
    }

    public Restaurant(String name, String location, int rating, boolean delivery, int price) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.delivery = delivery;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) this.rating = rating;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) this.price = price;
    }

    public String toString() {
        return "name=" + name + " location=" + location + ", rating=" + rating + ", delivery=" + delivery + ", price=" + price;

    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return rating == that.rating && delivery == that.delivery && price == that.price && Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }

    public int hashCode() {
        return Objects.hash(name, location, rating, delivery, price);
    }
}
