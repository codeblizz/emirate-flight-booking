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
public class Booking {
	
	@Id
	@GeneratedValue(generator="booking-generator")
	@GenericGenerator(name="booking-generator", 
			parameters = @Parameter(name="prefix", value="booking"),
			strategy="com.codeblizz.hibernate.pojo.generator.MyGenerator")
	private String bookingId;
	private Long totalBookings;
	private Boolean bookingStatus;

}
