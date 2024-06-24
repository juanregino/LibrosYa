package com.librosYa.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationBasicResponse {

  private Long id;
  private LocalDateTime reservationDate;

  private String status;
}
