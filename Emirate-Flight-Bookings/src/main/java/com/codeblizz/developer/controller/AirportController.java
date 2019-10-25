package com.codeblizz.developer.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeblizz.developer.repository.AirportRepository;
import com.codeblizz.developer.entity.Airport;

@RestController
@RequestMapping("/api")
public class AirportController {
	
	@Autowired
	AirportRepository airportRepo;
	
	@GetMapping("/get-allDetails")
	List<Airport> getAllDetails(){
		return airportRepo.findAll();
	}
	
	@GetMapping("/get-details/{id")
	ResponseEntity <Airport> getDetailsById(@PathVariable Long airlineRegistrationId){
		Optional<Airport> air = airportRepo.findById(airlineRegistrationId);
		return air.map(response->ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<> (HttpStatus.NOT_FOUND));
	}
	
	/*@PostMapping("/create-details")
	ResponseEntity<Airport> createDetails(@Valid @RequestBody Airport port){
		List<Airport> air = airportRepo.save(port);
				return ResponseEntity.ok().body(air); 
	}*/
	
	@PutMapping("/update")
	ResponseEntity<Airport> updateDetails(@Valid @RequestBody Airport port){
		Airport air = airportRepo.save(port);
		return ResponseEntity.ok().body(air);
	}
	
	@DeleteMapping("/delete-details/{id}")
	ResponseEntity <Airport> deleteDetailsById(@PathVariable Long airlineRegistrationId){
		airportRepo.deleteById(airlineRegistrationId);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/delete-all")
	ResponseEntity <Airport> deleteAllDetails(Airport port){
		airportRepo.deleteAll(port);
		return ResponseEntity.ok().build();
	}
	

}
