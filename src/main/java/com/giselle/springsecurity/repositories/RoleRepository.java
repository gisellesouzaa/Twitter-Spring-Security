package com.giselle.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giselle.springsecurity.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
