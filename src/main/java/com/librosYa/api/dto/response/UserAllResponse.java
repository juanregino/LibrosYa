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
public class UserAllResponse  extends UserBasicResponse {

  private List<BookBasicResponse> books;

  private List<ReservationBasicResponse> reservations;

}
