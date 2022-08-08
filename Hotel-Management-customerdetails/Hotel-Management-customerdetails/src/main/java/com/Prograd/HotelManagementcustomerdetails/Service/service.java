package com.Prograd.HotelManagementcustomerdetails.Service;

import com.Prograd.HotelManagementcustomerdetails.model.Hotel;

import java.util.List;

public interface service {
    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel getHotelById(int id);
    Hotel updateHotel(Hotel hotel,int id);
    void deleteHotel(int id);
}
