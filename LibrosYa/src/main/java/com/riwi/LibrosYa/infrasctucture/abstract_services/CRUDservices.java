package com.riwi.LibrosYa.infrasctucture.abstract_services;
import org.springframework.data.domain.Page;
import com.riwi.LibrosYa.utils.enaums.sortYpe;

public interface CRUDservices  <RQ,RS,ID>{

    public RS create(RQ request);

    public RS get(ID id);

    public RS update(RQ request, ID id);

    public void delete(ID id);

    public Page<RS> getAll(int page, int size, sortYpe sort);


}
