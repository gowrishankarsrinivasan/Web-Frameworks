package com.example.springapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Car;
import com.example.springapp.Services.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public Boolean addCar(@RequestBody Car car) {
        return apiService.addCar(car);
    }

    @GetMapping("/owners/{owners}")
    public List<Car> getCarsByOwners(@PathVariable String owners) {
        return apiService.getCarsByOwners(owners);
    }

    @GetMapping("/address/{address}")
    public List<Car> getCarsByAddress(@PathVariable String address) {
        return apiService.getCarsByAddress(address);
    }

    @GetMapping("/carname/{carname}")
    public List<Car> getCarsByCarname(@PathVariable String carname) {
        return apiService.getCarsByCarname(carname);
    }

    @GetMapping("/owners/{owners}/cartype/{cartype}")
    public List<Car> getCarsByOwnersAndCartype(@PathVariable String owners, @PathVariable String cartype) {
        return apiService.getCarsByOwnersAndCartype(owners, cartype);
    }

}
