package com.librosYa.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librosYa.domain.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
  
}
