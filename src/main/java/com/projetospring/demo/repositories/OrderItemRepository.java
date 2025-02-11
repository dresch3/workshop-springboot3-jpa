package com.projetospring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.demo.entities.OrderItem;
import com.projetospring.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
