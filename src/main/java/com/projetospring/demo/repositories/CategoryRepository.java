package com.projetospring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
