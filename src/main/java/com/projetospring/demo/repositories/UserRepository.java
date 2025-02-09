package com.projetospring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
