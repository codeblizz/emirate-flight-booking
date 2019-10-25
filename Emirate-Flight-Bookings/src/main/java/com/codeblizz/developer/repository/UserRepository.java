package com.codeblizz.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeblizz.developer.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
