package com.codeblizz.developer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.AdminWorkers;

@Repository
public interface AdminWorkerRepository extends JpaRepository<AdminWorkers, Long>{

	Optional<AdminWorkers> findAllById(Long staffId);
}
