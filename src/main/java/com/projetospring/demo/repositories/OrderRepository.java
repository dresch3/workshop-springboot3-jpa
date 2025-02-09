package com.projetospring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
