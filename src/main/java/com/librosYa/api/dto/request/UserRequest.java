package com.librosYa.api.dto.request;

import com.librosYa.utils.enums.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
  @NotBlank(message = "Username is required")
  @Size(min = 3, max = 50, message = "Username must be between 5 and 50 characters")
  private String username;
  @NotBlank(message = "Password is required")
  @Size(min = 8, max = 100, message = "password must be between 8 and 100 characters")
  private String password;
  @Email
  private String email;
  @NotBlank(message = "Name is required")
  @Size(min = 3, max = 100, message = "name must be between 3 and 100 characters")
  private String fullName;
  @NotNull (message = "Role is required")
  private Role role;
}
