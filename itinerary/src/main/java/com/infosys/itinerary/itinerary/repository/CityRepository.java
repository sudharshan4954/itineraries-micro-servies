package com.infosys.itinerary.itinerary.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.itinerary.itinerary.model.City;

/**
 * CityRepository class takes the support of JpaRepository for CURD operation to perform
 * on database tables
 * 
 * @author Sudharshan
 *
 */
public interface CityRepository extends JpaRepository<City, Integer> {
    List<City> findByCity(String username);
}