package com.librosYa.infraestructure.abstract_services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CRUDService <Request, Response, Id> {
  Response create(Request request);

  Response update(Id id, Request request);

  void delete(Id id);

  Page<Response> getAll(Pageable pageable);

  Optional<Response> getById(Id id);
}
