package com.example.mobile_ui.Model;

import android.graphics.Bitmap;

public class Product {
    private int imageRepresent;
    private String name;
    private int price;
    private double star;
    private Bitmap imgFromUrl;
    private int number;

    public Product(int imageRepresent, String name, int price, double star) {
        this.imageRepresent = imageRepresent;
        this.name = name;
        this.price = price;
        this.star = star;
    }

    public Product(Bitmap imgFromUrl, String name, int price, double star) {
        this.imgFromUrl = imgFromUrl;
        this.name = name;
        this.price = price;
        this.star = star;
    }

    public Product(int imageRepresent, String name, int price, int number) {
        this.imageRepresent = imageRepresent;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public int getNumber() { return number;}

    public void setNumber(int number) { this.number = number; }

    public Bitmap getImgFromUrl() { return imgFromUrl; }

    public void setImgFromUrl(Bitmap imgFromUrl) { this.imgFromUrl = imgFromUrl; }

    public int getImageRepresent() {
        return imageRepresent;
    }

    public void setImageRepresent(int imageRepresent) {
        this.imageRepresent = imageRepresent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }
}