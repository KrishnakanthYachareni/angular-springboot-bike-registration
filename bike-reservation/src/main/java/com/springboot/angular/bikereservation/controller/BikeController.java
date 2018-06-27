/**
 * 
 */
package com.springboot.angular.bikereservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.angular.bikereservation.model.Bike;
import com.springboot.angular.bikereservation.repository.BikeRepository;

/**
 * @author Krishnakanth_Yachareni
 *
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
