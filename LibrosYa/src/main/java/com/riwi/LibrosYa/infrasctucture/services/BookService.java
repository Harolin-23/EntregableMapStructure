package com.riwi.LibrosYa.infrasctucture.services;


import com.riwi.LibrosYa.Api.dto.mappers.BookMapper;
import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.Api.dto.response.bookResponse;
import com.riwi.LibrosYa.domain.entities.book;
import com.riwi.LibrosYa.domain.repositories.bookRepository;
import com.riwi.LibrosYa.infrasctucture.abstract_services.IbookService;
import com.riwi.LibrosYa.utils.enaums.sortYpe;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookService implements IbookService {


    private final bookRepository getBookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookService(bookRepository bookRepository, BookMapper bookMapper) {
        this.getBookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public bookResponse create(bookRequest request) {
        book entity = bookMapper.requestToEntity(request);
        book savedEntity = getBookRepository.save(entity);
        return bookMapper.entityToResponse(savedEntity);
    }
    @Override
    public bookResponse get(Long aLong) {
        return null;
    }

    @Override
    public bookResponse update(bookRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<bookResponse> getAll(int page, int size, sortYpe sort) {
        return null;
    }







}
