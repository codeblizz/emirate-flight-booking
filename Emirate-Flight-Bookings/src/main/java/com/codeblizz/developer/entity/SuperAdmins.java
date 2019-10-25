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
public class SuperAdmins {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String FirstName;
	private String LastName;
	private String email;
	private String userName;
	private String password;
	private Long passportNumber;
	private Long phoneNumber;
	private Long staffId;
	private Long adminId;

}
