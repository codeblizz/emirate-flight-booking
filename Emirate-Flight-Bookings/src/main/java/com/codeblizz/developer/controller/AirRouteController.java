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

import com.codeblizz.developer.entity.AirRoute;
import com.codeblizz.developer.repository.AirRouteRepository;

@RestController
@RequestMapping("/api")
public class AirRouteController {
	
	@Autowired
	AirRouteRepository routeRepo;
	
	@GetMapping("/get-route")
	List<AirRoute> getAllDetails(){
		return routeRepo.findAll();
	}

	@GetMapping("/details/{id}")
	ResponseEntity <AirRoute> getDetailsById(@PathVariable Long id){
		Optional <AirRoute> route = routeRepo.findById(id);
		return route.map(response->ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	/*@PostMapping("/create/{id}")
	ResponseEntity <AirRoute> createDetailsById(@PathVariable Long id){
		return ResponseEntity.ok().body();
	}*/
	
	@PutMapping("/update")
	ResponseEntity <AirRoute> createDetails(@Valid @RequestBody AirRoute route){
		AirRoute air = routeRepo.save(route);
		return ResponseEntity.ok().body(air);
	}
	
	@PutMapping("/update/{id}")
	ResponseEntity<AirRoute> updateDetailsById(@PathVariable Long id){
		AirRoute air = (AirRoute) routeRepo.save(id);
		return ResponseEntity.ok().body(air);
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity <AirRoute> deleteDetailsById(@PathVariable Long id){
		routeRepo.deleteById(id);
		return ResponseEntity.ok().build();
	}
	@DeleteMapping("/delete")
	ResponseEntity <AirRoute> deleteDetails(AirRoute route){
		routeRepo.delete(route);
		return ResponseEntity.ok().build();
	}
}
