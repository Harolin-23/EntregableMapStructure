package com.riwi.LibrosYa.infrasctucture.abstract_services;


import com.riwi.LibrosYa.Api.dto.request.bookRequest;
import com.riwi.LibrosYa.Api.dto.response.bookResponse;

public interface ILoanService extends CRUDservices<bookRequest, bookResponse,Long>{
}
