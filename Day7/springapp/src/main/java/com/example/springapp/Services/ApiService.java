package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Car;
import com.example.springapp.Repositories.CarRepo;

@Service
public class ApiService {

    @Autowired
    private CarRepo carRepo;

    public Boolean addCar(Car car) {
        try {
            carRepo.save(car);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Car> getCarsByOwners(String owners) {
        return carRepo.getCarsByOwners(owners);
    }

    public List<Car> getCarsByAddress(String address) {
        return carRepo.getCarsByAddress(address);
    }

    public List<Car> getCarsByCarname(String carname) {
        return carRepo.getCarsByCarname(carname);
    }

    public List<Car> getCarsByOwnersAndCartype(String owners, String cartype) {
        return carRepo.getCarsByOwnersAndCartype(owners, cartype);
    }

}
