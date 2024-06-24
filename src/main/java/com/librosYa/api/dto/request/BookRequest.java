package com.librosYa.api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {
  @NotBlank(message = "Title is required")
  @Size(min = 3, max = 100, message = "Title must be between 3 and 100 characters")
  private String title;

  @NotBlank(message = "Author is required")
  @Size(min = 3, max = 100, message = "Author must be between 3 and 100 characters")
  private String author;
  
  @NotBlank(message = "ISBN is required")
  @Size(min = 13, max = 13, message = "ISBN must be between 13 and 13 characters")
  private String isbn;

  @NotNull(message = "Publisher is required")
  @Min(value = 1, message = "Publisher must be greater than 0")
  @Max(value = 11, message = "Publisher must be less than 100")
  private Integer publisher;

  @NotBlank(message = "Genre is required")
  @Size(min = 3, max = 50, message = "Genre must be between 3 and 50 characters")
  private String genre;
}
