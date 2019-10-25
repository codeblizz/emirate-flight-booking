package com.codeblizz.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Airport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long airlineRegistrationId;
	public Boolean airportMaintenance; 
	public Boolean airportClosed; 
	public String airportLocation; 

}
