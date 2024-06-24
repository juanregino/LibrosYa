package com.librosYa.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librosYa.domain.entities.User;

public interface UserRepository extends  JpaRepository<User, Long> {  
  
}
