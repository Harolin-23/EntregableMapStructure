package com.riwi.LibrosYa.Api.dto.mappers;

import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.Api.dto.response.bookResponse;
import com.riwi.LibrosYa.domain.entities.book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T12:58:17-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public book requestToEntity(bookRequest request) {
        if ( request == null ) {
            return null;
        }

        book book = new book();

        return book;
    }

    @Override
    public bookResponse entityToResponse(book entity) {
        if ( entity == null ) {
            return null;
        }

        bookResponse bookResponse = new bookResponse();

        return bookResponse;
    }
}
