package com.springboot.angular.bikereservation.controller;

import com.springboot.angular.bikereservation.model.Bike;
import com.springboot.angular.bikereservation.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Krishnakanth_Yachareni
 */
@RestController
@RequestMapping("api/v1/bikes")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> list() {
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {
        return bikeRepository.getOne(id);
    }
}
