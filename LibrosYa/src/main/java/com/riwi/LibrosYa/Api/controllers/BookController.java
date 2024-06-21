package com.riwi.LibrosYa.Api.controllers;


import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.Api.dto.response.bookResponse;
import com.riwi.LibrosYa.infrasctucture.abstract_services.IbookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "books")
@AllArgsConstructor
public class BookController {

    private final IbookService bookService;



    @PostMapping
    public ResponseEntity<bookResponse> insert(@Validated @RequestBody bookRequest request) {
        bookResponse response = bookService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
