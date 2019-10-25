package com.codeblizz.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class WeatherCondition {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long weatherId;
	String weatherReport;
	Boolean travelCondition;

}
