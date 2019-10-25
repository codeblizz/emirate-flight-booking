package com.codeblizz.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.WeatherCondition;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherCondition, Long>{

}
