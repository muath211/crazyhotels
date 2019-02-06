package com.crazyhotel.dto;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {

    private List<Hotel> hotels = new ArrayList<>();

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void addHotels(List<Hotel> hotels) {
        this.hotels.addAll(hotels);
    }
}
