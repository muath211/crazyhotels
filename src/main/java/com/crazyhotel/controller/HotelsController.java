package com.crazyhotel.controller;


import com.crazyhotel.dto.Hotel;
import com.crazyhotel.dto.SearchRequest;
import com.crazyhotel.dto.SearchResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HotelsController {

    @PostMapping("CrazyHotels")
    @ResponseBody
    public SearchResult findHotels(@RequestBody SearchRequest searchRequest) {


        List<Hotel> hotels = new ArrayList<>();
        hotels.add(createDummyHotel(99.3, "Sheraton", new String[]{"Hair dryer", "Kitchen facilities", "Television"}));

        SearchResult searchResult = new SearchResult();
        searchResult.addHotels(hotels);
        return searchResult;
    }

    private Hotel createDummyHotel(double price, String name, String[] roomAmenities) {
        Hotel hotel = new Hotel();
        hotel.setPrice(price);
        hotel.setName(name);
        hotel.setRate("***");
        hotel.setAmenities(roomAmenities);
        return hotel;
    }


}
