package com.riwi.LibrosYa.Api.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class bookResponse {
    private long idBook;
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private String isbn;
}
