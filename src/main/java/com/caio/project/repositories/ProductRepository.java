package com.caio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
