package com.librosYa.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBasicResponse {
  private Long id;

    private String username;

    private String email;

    private String password;

    private String fullName;

    private String role;
}

