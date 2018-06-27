/**
 * 
 */
package com.springboot.angular.bikereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.angular.bikereservation.model.Bike;

/**
 * @author Krishnakanth
 *
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
