package com.codeblizz.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Ticket {
	
	@Id
	@GeneratedValue(generator="ticket-generator")
	@GenericGenerator(name="ticket-generator", 
			parameters=@Parameter(name="prefix", value="ticket"),
			strategy="com.codeblizz.hibernate.pojo.generator.MyGenerator")
	private String ticketNumber;
	private Long seatNumber;
	private Integer ticketCancelled; 
	private Integer ticketSold; 
	private Integer ticketRemaining;

}
