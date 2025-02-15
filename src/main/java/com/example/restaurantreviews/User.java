package com.example.restaurantreviews;

import java.util.Objects;

public class User {
    private String username;
    private String email;
    private int age;
    private double spending;
    private boolean verified;

    public User() {
    }

    public User(String username, String email, int age, double spending, boolean verified) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.spending = spending;
        this.verified = verified;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public double getSpending() {
        return spending;
    }

    public void setSpending(double spending) {
        if (spending > 0) this.spending = spending;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String toString() {
        return "username=" + username + ", email=" + email + ", age=" + age + ", spending=" + spending + ", verified=" + verified;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Double.compare(spending, user.spending) == 0 && verified == user.verified && Objects.equals(username, user.username) && Objects.equals(email, user.email);
    }

    public int hashCode() {
        return Objects.hash(username, email, age, spending, verified);
    }
}
