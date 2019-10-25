package com.codeblizz.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.AirRoute;

@Repository
public interface RouteRepository extends JpaRepository<AirRoute, Long>{

}
