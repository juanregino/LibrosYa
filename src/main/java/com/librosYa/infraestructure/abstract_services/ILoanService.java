package com.librosYa.infraestructure.abstract_services;

import com.librosYa.api.dto.request.LoanRequest;
import com.librosYa.api.dto.response.LoanAllResponse;
import com.librosYa.domain.entities.Loan;

public interface ILoanService extends CRUDService<LoanRequest, LoanAllResponse, Long> {
  Loan getLoanById(Long id);
}
