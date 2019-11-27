package com.codeblizz.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Passenger {
	
	@Id
	@GeneratedValue(generator="passenger-generator")
	@GenericGenerator(name="passenger-generator" ,
			parameters = @Parameter(name="prefix", value="passenger"),
			strategy = "com.codeblizz.hibernate.pojo.generator.MyGenerator")
	public String passengerId;
	public String firstName;
	public String lastName;
	public String email;
	@NonNull
	public String userName;
	public String password;
	public String passportNumber;
	public String phoneNumber;
}
