package com.codeblizz.developer.entity;

import java.util.List;

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
public class AirRoute {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long routeId;
	List <String> routeName;

}
