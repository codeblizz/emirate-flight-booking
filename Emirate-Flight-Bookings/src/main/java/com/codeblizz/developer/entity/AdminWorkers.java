package com.codeblizz.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class AdminWorkers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long staffId;
	private String firstName;
	private String lastName;
	private String email;
	@NonNull
	private String userName;
	private String password;
	private Long passportNumber;
	private Long phoneNumber;
}
