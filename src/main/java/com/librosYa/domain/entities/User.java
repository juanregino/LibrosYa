package com.librosYa.domain.entities;
import java.util.List;

import com.librosYa.utils.enums.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(length = 50, nullable = false)
  private String username;
  @Column(length = 100, nullable = false)
  private String password;

  @Column(length = 100, nullable = false)
  private String email;

  @Column(length = 100, nullable = false)
  private String fullName;

  @Column(length = 20, nullable = false)
  @Enumerated(EnumType.STRING)
  private Role role;
 
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Loan> loans;

     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Reservation> reservations;

}
