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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeblizz.developer.entity.Airplane;
import com.codeblizz.developer.repository.AirplaneRepository;

@RestController
@RequestMapping("/api")
public class AirplaneController {

	@Autowired
	AirplaneRepository airplaneRepo;
	
	@GetMapping("/get")
	List <Airplane> getAllDetails(){
		return airplaneRepo.findAll();
	}
	
	@GetMapping("/get-details/{id}")
	ResponseEntity <Airplane> getDetailsById(@PathVariable Long id){
		Optional <Airplane> pl = airplaneRepo.findAllById(id);
		return pl.map(response->ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/create-details")
	ResponseEntity <Airplane> createDetails(@Valid @RequestBody Airplane plane){
		Airplane pl = airplaneRepo.save(plane);
		return ResponseEntity.ok().body(pl);
	}
	
	@PutMapping("/update-details")
	ResponseEntity<Airplane> updateDetailsById(@Valid @RequestBody Airplane plane){
		Airplane pl = airplaneRepo.save(plane);
		return ResponseEntity.ok().body(pl);
	}
	
	@DeleteMapping("/delete-details/{id}")
	ResponseEntity <Airplane> deleteById(@PathVariable Long id){
		airplaneRepo.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
	@DeleteMapping("/delete-all")
	ResponseEntity<Airplane> deleteAllDetails(){
		airplaneRepo.deleteAll();
		return ResponseEntity.ok().build();
	}
}
	
