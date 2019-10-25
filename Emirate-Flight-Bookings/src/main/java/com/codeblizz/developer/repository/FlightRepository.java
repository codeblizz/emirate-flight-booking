package com.codeblizz.developer.repository;

import java.util.List;
import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;

import com.codeblizz.developer.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long>{

	Optional<Flight> findAllByFlightNumber(Long flightNumber);

	List<Flight> saveAll(Long flightNumber);

	void deleteByFlightNumber(Long flightNumber);

}
