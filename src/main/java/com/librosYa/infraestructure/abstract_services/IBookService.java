package com.librosYa.infraestructure.abstract_services;

import com.librosYa.api.dto.request.BookRequest;
import com.librosYa.api.dto.response.BookAllResponse;
import com.librosYa.domain.entities.Book;

public interface IBookService extends CRUDService<BookRequest, BookAllResponse, Long> {
    Book getBookById(Long id);
}
