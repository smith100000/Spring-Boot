package com.Prograd.HotelManagementcustomerdetails.Service;
import com.Prograd.HotelManagementcustomerdetails.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ServiceImpl implements service{
    @Autowired
    private com.Prograd.HotelManagementcustomerdetails.Repository.UserRepo UserRepo;
    public ServiceImpl(com.Prograd.HotelManagementcustomerdetails.Repository.UserRepo UserRepo){
        this.UserRepo=UserRepo;
    }


    @Override
    public Hotel saveHotel(Hotel hotel) {
        return UserRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return (List<Hotel>) UserRepo.findAll();
    }

    @Override
    public Hotel getHotelById(int id) {
        return UserRepo.findById(id).orElseThrow();
    }

    @Override
    public Hotel updateHotel(Hotel hotel, int id) {
        Hotel existingHotel=UserRepo.findById(id).orElseThrow();
        existingHotel.setCustomerName(hotel.getCustomerName());
        existingHotel.setEmailId(hotel.getEmailId());
        existingHotel.setPhoneNumber(hotel.getPhoneNumber());
        UserRepo.save(existingHotel);

        return existingHotel;
    }

    @Override
    public void deleteHotel(int id) {
        UserRepo.findById(id);
        UserRepo.deleteById(id);

    }
}
