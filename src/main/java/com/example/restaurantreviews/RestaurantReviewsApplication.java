package com.example.restaurantreviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantReviewsApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantReviewsApplication.class, args);

        Restaurant restaurant1 = new Restaurant("Trattoria", "Chisinau", 4, true, 100);
        Restaurant restaurant2 = new Restaurant("La Placinte", "Bucuresti", 5, false, 80);

        Review review1 = new Review("Andrei Popescu", 5, "Mancare excelenta", "Delicios", "2025-02-14");
        Review review2 = new Review("Ana Modarca", 3, "Serviciu cam lent.", "Ok", "2025-02-10");
        Review review3 = new Review("Andrei Popescu", 5, "Mancare excelenta", "Delicios", "2025-02-14");

        User user1 = new User("andrei2002", "andrei2002@gmail.com", 25, 200.50, true);
        User user2 = new User("anamodarca", "modarca@yahoo.com", 19, 500.75, false);

        System.out.println(restaurant1);
        System.out.println(restaurant2);
        System.out.println(review1);
        System.out.println(review2);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(review1.equals(review3));
        System.out.println(user1.getUsername());
        user2.setAge(22);
        System.out.println(user2.getAge());
    }
}
