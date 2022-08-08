package com.Prograd.HotelManagementcustomerdetails.Security;

import com.Prograd.HotelManagementcustomerdetails.Repository.UserRepo;
import com.Prograd.HotelManagementcustomerdetails.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component

public class HotelDetails implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hotel hotel= this.userRepo.findByEmailId(username).orElseThrow();
        return hotel;
    }
}
