package com.codewithevans.msscbeerorderservice.web.mappers;

import com.codewithevans.msscbeerorderservice.domain.Customer;
import com.codewithevans.brewery.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}
