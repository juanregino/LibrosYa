package com.librosYa.infraestructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.librosYa.api.dto.request.UserRequest;
import com.librosYa.api.dto.response.UserAllResponse;
import com.librosYa.domain.entities.User;


@Mapper(componentModel = "spring")

public interface UserMapper {
  @Mapping(target = "id", ignore = true)
  User toUser(UserRequest request);

  UserAllResponse toUserAllResponse(User user);

  // METODO QUE SE USA PARA EL ACTUALIZADO
  @Mapping(target = "id", ignore = true)
  // Es el destino objetivo de los datos
  void updateFromUserRequest(UserRequest userRequest, @MappingTarget User user);

}
