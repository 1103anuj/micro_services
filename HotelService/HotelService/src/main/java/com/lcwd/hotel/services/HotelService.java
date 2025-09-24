package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {


    //create
    Hotel create(Hotel hotel);

    //getakk
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
