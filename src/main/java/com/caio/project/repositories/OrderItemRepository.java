package com.caio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
