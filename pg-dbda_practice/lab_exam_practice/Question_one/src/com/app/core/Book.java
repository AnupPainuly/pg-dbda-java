package com.app.core;

import java.time.LocalDate;

public class Book {
    private String title; // Primary Key
    private String author;
    private double price;
    private LocalDate publishDate;
//    private LocalDate publishDate;

    public Book(String title, String author, double price, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", Publish Date: " + publishDate;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}