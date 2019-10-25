package com.codeblizz.developer.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.codeblizz.developer.entity.AdminWorkers;
import com.codeblizz.developer.repository.AdminWorkerRepository;

@RestController
@RequestMapping("/api")
public class AdminWorkerController {
	
	@Autowired
	AdminWorkerRepository adminWorkerRepo;
	
	private final Logger log = LoggerFactory.getLogger(AdminWorkerController.class);
	
	@GetMapping("/{id}")
	Optional <AdminWorkers> getDetailsById(@PathVariable Long staffId){
		log.info("Get each AdminWorkers' details by Staff Id: {}" );
		return adminWorkerRepo.findById(staffId);	
	}
	
	@GetMapping("/{id}")
	ResponseEntity <AdminWorkers> getAllDetailsById(@PathVariable Long staffId){
		log.info("Get all AdminWorkers' details by staff Id: {}", staffId);
		Optional<AdminWorkers> worker = adminWorkerRepo.findAllById(staffId);
			return worker.map(response-> ResponseEntity.ok().body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/create")
	ResponseEntity <AdminWorkers> createDetails(@Valid @RequestBody AdminWorkers ad){
		log.info("Let's you update all your user details: {}", ad);		
		AdminWorkers worker = adminWorkerRepo.save(ad);
		return ResponseEntity.ok().body(worker);
	}
	
	@PutMapping("/update")
	ResponseEntity <AdminWorkers> updateDetails(@RequestBody AdminWorkers ad){
		AdminWorkers ads = adminWorkerRepo.save(ad);
		return ResponseEntity.ok().body(ads);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity <AdminWorkers> deleteDetailsById(@PathVariable Long staffId){
		adminWorkerRepo.deleteById(staffId);
		return ResponseEntity.ok().build();
	}	
}
