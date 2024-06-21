package com.riwi.LibrosYa.infrasctucture.abstract_services;

import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.Api.dto.response.bookResponse;

import java.awt.print.Book;

public interface IbookService extends CRUDservices<bookRequest, bookResponse,Long>{
    public final String FIELD_BY_SORT = "title";

}
