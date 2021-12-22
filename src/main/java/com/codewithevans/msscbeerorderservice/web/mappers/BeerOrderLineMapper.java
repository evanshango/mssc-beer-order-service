package com.codewithevans.msscbeerorderservice.web.mappers;

import com.codewithevans.msscbeerorderservice.domain.BeerOrderLine;
import com.codewithevans.brewery.model.BeerOrderLineDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {

    @Mapping(target = "price", ignore = true)
    @Mapping(target = "beerStyle", ignore = true)
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    @Mapping(target = "quantityAllocated", ignore = true)
    @Mapping(target = "beerOrder", ignore = true)
    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
