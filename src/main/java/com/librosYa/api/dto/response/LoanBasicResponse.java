package com.librosYa.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanBasicResponse {
  private Long id;

  private LocalDateTime loanDate;

  private LocalDateTime returnDate;

  private String status;

}
