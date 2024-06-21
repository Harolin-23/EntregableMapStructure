package com.riwi.LibrosYa.Api.dto.request;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class bookRequest {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private String isbn;
}
