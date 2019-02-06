package com.crazyhotel.dto;

public class Hotel {

    private String name;

    private String rate; // String of '*' from 1-5, Eg: *, *****

    private double price; // Price of the hotel per night

    private double discount; // discount on the room (if available).

    private String[] amenities; //String of amenities separated by comma

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String[] getAmenities() {
        return amenities;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }
}
