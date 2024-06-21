package com.riwi.LibrosYa.Api.dto.mappers;


import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.Api.dto.response.bookResponse;
import com.riwi.LibrosYa.domain.entities.book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

@Mapper

public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    //@Mapping(source = "publicationYear", target = "publication_year")
    book requestToEntity(bookRequest request);

    bookResponse entityToResponse(book entity);

}
