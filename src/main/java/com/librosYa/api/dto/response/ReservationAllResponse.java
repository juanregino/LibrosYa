package com.librosYa.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ReservationAllResponse {
  private UserBasicResponse userId;

  private BookBasicResponse bookId;
}
