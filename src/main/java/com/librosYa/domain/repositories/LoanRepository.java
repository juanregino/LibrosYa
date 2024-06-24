package com.librosYa.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librosYa.domain.entities.Loan;

public interface LoanRepository extends  JpaRepository<Loan, Long> {
  
}
