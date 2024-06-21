package com.riwi.LibrosYa.domain.repositories;



import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.domain.entities.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepository extends JpaRepository<book, Long> {

}
