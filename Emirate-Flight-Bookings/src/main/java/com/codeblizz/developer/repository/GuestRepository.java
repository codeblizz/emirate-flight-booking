package com.codeblizz.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.Passenger;

@Repository
public interface GuestRepository extends JpaRepository<Passenger, Long> {

}
