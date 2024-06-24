package com.librosYa.domain.entities;

import java.math.BigInteger;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 100, nullable = false)
  private String title;

  @Column(length = 100, nullable = false)
  private String author;


  @Column(length = 20, nullable = false)
  private String isbn;


  @Column(length = 11, nullable = false)
  private Integer publisher;

  @Column(length = 50, nullable = false)
  private String genre;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Loan> loans;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Reservation> reservations;

   
}
