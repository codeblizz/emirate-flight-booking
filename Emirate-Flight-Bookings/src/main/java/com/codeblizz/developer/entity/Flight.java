package com.codeblizz.developer.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long flightNumber;
	@NonNull
	private String flightName;
	private String flightType;
	private Boolean flightStatus;
	private LocalDateTime flightDateTime;
	private String flightDestination;
	

}
