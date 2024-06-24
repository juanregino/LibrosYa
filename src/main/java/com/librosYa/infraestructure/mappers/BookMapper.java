package com.librosYa.infraestructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.librosYa.api.dto.request.BookRequest;
import com.librosYa.api.dto.response.BookAllResponse;
import com.librosYa.domain.entities.Book;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface BookMapper {
  @Mapping(target = "id", ignore = true)
  Book toBook(BookRequest bookRequest);

  BookAllResponse tBookAllResponse (Book book);

  // METODO QUE SE USA PARA EL ACTUALIZADO
  @Mapping(target = "id", ignore = true)
  // Es el destino objetivo de los datos
  void updateFromBookRequest(BookRequest bookRequest, @MappingTarget Book book);
}
