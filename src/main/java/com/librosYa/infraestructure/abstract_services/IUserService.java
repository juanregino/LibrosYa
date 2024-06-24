package com.librosYa.infraestructure.abstract_services;

import com.librosYa.api.dto.request.UserRequest;
import com.librosYa.api.dto.response.UserAllResponse;
import com.librosYa.domain.entities.User;

public interface IUserService extends CRUDService<UserRequest, UserAllResponse, Long> {
  User getUserById(Long id);
}
