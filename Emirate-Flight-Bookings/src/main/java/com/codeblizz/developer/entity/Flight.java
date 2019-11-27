package com.codeblizz.developer.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

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
	@GeneratedValue(generator = "flight-generator")
    @GenericGenerator(name = "flight-generator", 
      parameters = @Parameter(name = "prefix", value = "flight"), 
      strategy = "com.codeblizz.hibernate.pojo.generator.MyGenerator")
	private String flightNumber;
	@NonNull
	private String flightName;
	private String flightType;
	private Boolean flightStatus;
	private LocalDateTime flightDateTime;
	private String flightDestination;
	

}
