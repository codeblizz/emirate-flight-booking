package com.codeblizz.developer.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.Airplane;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {

	Optional<Airplane> findAllById(Long id);

}
