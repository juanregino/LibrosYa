package com.librosYa.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanAllResponse {
  private UserBasicResponse userId;

  private BookBasicResponse bookId;
}
