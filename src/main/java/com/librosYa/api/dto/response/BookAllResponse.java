package com.librosYa.api.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookAllResponse extends BookBasicResponse {
  private List<LoanBasicResponse> loans;

  private List<ReservationBasicResponse> reservations;
}
