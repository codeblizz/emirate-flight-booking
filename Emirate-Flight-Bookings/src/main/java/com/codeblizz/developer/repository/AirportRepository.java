package com.codeblizz.developer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

	//Optional<Airport> findById(Long airlineRegistrationId);

	void deleteAll(Airport port);

}
