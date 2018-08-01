package com.jorgel.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jorgel.delivery.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}
