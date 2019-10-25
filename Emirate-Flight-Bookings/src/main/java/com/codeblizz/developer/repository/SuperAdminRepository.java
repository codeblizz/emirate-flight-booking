package com.codeblizz.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.SuperAdmins;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdmins, Long>{

}
