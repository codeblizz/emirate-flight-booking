package com.codeblizz.developer.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeblizz.developer.entity.Flight;
import com.codeblizz.developer.repository.FlightRepository;

@RestController
@RequestMapping("/api")
public class FlightController {

	@Autowired
	FlightRepository flightRepo;
	
	@GetMapping("/get-flight-details")
	List<Flight> getAllDetails(){
		return flightRepo.findAll();
	}
	
	@GetMapping("/get-details/{ticketnumber}")
	ResponseEntity <Flight> getDetailsById(@Valid @PathVariable Long flightNumber){
		Optional<Flight> flight = flightRepo.findAllByFlightNumber(flightNumber);
		return flight.map(response->ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	/*@PostMapping("/create/{flightNumber}")
	ResponseEntity <Flight> createDetailsById(@PathVariable Long flightNumber){
		return ;
	}*/
	
	@PutMapping("/update/{flightNumber}")
	ResponseEntity<List<Flight>> updateDetailsByFlightNumber(@Valid @PathVariable Long flightNumber){
		List <Flight> flight = flightRepo.saveAll(flightNumber);
		return ResponseEntity.ok().body(flight);
	}
	@DeleteMapping("delete-details/{flightNumber}")
	ResponseEntity <Flight> deleteDetailsById(@PathVariable Long flightNumber){
		flightRepo.deleteByFlightNumber(flightNumber);
		return ResponseEntity.ok().build();
	}
}
