package com.example.springapp.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springapp.Models.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

    @Query("SELECT c FROM Car c WHERE c.owners = :owners")
    List<Car> getCarsByOwners(@Param("owners") String owners);

    @Query("SELECT c FROM Car c WHERE c.address = :address")
    List<Car> getCarsByAddress(@Param("address") String address);

    @Query("SELECT c FROM Car c WHERE c.carName = :carname")
    List<Car> getCarsByCarname(@Param("carname") String carname);

    @Query("SELECT c FROM Car c WHERE c.owners = :owners AND c.carType = :cartype")
    List<Car> getCarsByOwnersAndCartype(@Param("owners") String owners, @Param("cartype") String cartype);

}