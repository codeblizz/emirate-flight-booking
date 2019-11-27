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

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Users {
	
	@Id
	@GeneratedValue(generator="user-generator")
	@GenericGenerator(name="user-generator",
			parameters=@Parameter(name="prefix", value="userId"),
			strategy="com.codeblizz.hibernate.pojo.generator.MyGenerator")		
	private String userId;
	private String FirstName;
	private String LastName;
	private String email;
	@NonNull
	private String userName;
	private String password;
	private long passportNumber;
	private long phoneNumber;

}
