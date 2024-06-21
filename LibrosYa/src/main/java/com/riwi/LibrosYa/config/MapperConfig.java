package com.riwi.LibrosYa.config;

import com.riwi.LibrosYa.Api.dto.mappers.BookMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public BookMapper bookMapper() {
        return Mappers.getMapper(BookMapper.class);
    }


}
