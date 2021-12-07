package com.codewithevans.msscbeerorderservice.web.mappers;

import com.codewithevans.msscbeerorderservice.domain.BeerOrderLine;
import com.codewithevans.msscbeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
