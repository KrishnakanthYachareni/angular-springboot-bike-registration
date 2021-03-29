package com.springboot.angular.bikereservation.repository;

import com.springboot.angular.bikereservation.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Krishnakanth
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
