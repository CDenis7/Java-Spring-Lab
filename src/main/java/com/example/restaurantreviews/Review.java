package com.example.restaurantreviews;

import java.util.Objects;

public class Review {
    private String author;
    private int stars;
    private String comment;
    private String title;
    private String date;

    public Review() {
    }

    public Review(String author, int stars, String comment, String title, String date) {
        this.author = author;
        this.stars = stars;
        this.comment = comment;
        this.title = title;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        if (stars >= 1 && stars <= 5) this.stars = stars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString() {
        return "author=" + author + ", stars=" + stars + ", title=" + title + ", comment=" + comment + ", date=" + date;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return stars == review.stars && Objects.equals(title, review.title) && Objects.equals(author, review.author) && Objects.equals(comment, review.comment) && Objects.equals(date, review.date);
    }

    public int hashCode() {
        return Objects.hash(author, stars, comment, title, date);
    }
}
