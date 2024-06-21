package com.riwi.LibrosYa.domain.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity( name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id_book;
    @Column(length = 100,nullable = false)
    String title;
    @Column(length = 100,nullable = false)
    String author;
    @Column(nullable = false)
    int publication_year;
    @Column(length = 50,nullable = false)
    String genre;
    @Column(length = 20,nullable = false)
    String isbn;


    @OneToMany(mappedBy = "book")
    private List<loan> loans;

    @OneToMany(mappedBy = "book")
    private List<reservation> reservations;


}
