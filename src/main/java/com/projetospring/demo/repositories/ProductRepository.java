package com.projetospring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
