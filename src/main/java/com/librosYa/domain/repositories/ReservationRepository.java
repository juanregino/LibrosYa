package com.librosYa.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librosYa.domain.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
  
}
