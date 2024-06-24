package com.librosYa.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoanRequest {
  @FutureOrPresent(message = "Loan date must be in the future")
  @NotNull(message = "Loan date must not be null")
  private LocalDateTime loanDate;
  @FutureOrPresent
  @NotNull(message = "Return date must not be null")

  private LocalDateTime returnDate;
  @NotNull(message = "Book id must not be null")  
  @Min(message = "Book id must be greater than 0", value = 1)
  private Long bookId;
  @NotNull(message = "User id must not be null")  
  @Min(message = "User id must be greater than 0", value = 1)
  private Long userId;
}
