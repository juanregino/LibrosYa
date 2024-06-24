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

public class ReservationRequest {
  @FutureOrPresent(message = "Reservation date must be in the future")
  @NotNull(message = "Reservation date must not be null")
private LocalDateTime reservationDate;
@NotNull(message = "Book id must not be null")  
@Min(message = "Book id must be greater than 0", value = 1)
private Long bookId;

  @NotNull(message = "User id must not be null")  
  @Min(message = "User id must be greater than 0", value = 1)
private Long userId;
}