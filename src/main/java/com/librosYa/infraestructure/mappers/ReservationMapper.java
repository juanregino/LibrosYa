package com.librosYa.infraestructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.librosYa.api.dto.request.ReservationRequest;
import com.librosYa.api.dto.response.ReservationAllResponse;
import com.librosYa.domain.entities.Reservation;

@Mapper(componentModel = "spring" , uses = {UserMapper.class, BookMapper.class})
public interface ReservationMapper {
  @Mappings({
      @Mapping(target = "id", ignore = true),
      @Mapping(target = "bookId.id", source = "bookId"),
      @Mapping(target = "userId.id", source = "userId")
  })
  Reservation toReservation(ReservationRequest reservationRequest);

  ReservationAllResponse toReservationResponse(Reservation reservation);

  @Mappings({
      @Mapping(target = "id", ignore = true),
      @Mapping(target = "bookId.id", source = "bookId"),
      @Mapping(target = "userId.id", source = "userId")
  })
  void updateFromReservationRequest(ReservationRequest reservationRequest, @MappingTarget Reservation reservation);
}
