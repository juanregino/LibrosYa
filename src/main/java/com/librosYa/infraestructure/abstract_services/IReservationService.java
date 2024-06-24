package com.librosYa.infraestructure.abstract_services;

import com.librosYa.api.dto.request.ReservationRequest;
import com.librosYa.api.dto.response.ReservationAllResponse;
import com.librosYa.domain.entities.Reservation;

public interface IReservationService extends CRUDService<ReservationRequest, ReservationAllResponse, Long> {
    Reservation getReservationById(Long id);
}
