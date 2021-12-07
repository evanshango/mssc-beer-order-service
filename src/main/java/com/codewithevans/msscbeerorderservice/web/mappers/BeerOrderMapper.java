package com.codewithevans.msscbeerorderservice.web.mappers;

import com.codewithevans.msscbeerorderservice.domain.BeerOrder;
import com.codewithevans.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
