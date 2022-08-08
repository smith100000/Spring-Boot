package com.Prograd.HotelManagementcustomerdetails.Repository;

import com.Prograd.HotelManagementcustomerdetails.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<Hotel,Integer> {
    Optional<Hotel> findByEmailId(String emailId);


}
