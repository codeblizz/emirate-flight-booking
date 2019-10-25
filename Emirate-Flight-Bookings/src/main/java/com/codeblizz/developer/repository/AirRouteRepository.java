package com.codeblizz.developer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeblizz.developer.entity.AirRoute;

public interface AirRouteRepository extends JpaRepository<AirRoute, Long>{

	List<AirRoute> save(Long id);

}
