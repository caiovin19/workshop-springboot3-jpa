package com.caio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
