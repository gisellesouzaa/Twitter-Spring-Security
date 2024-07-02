package com.giselle.springsecurity.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giselle.springsecurity.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
