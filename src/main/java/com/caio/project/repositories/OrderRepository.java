package com.caio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
