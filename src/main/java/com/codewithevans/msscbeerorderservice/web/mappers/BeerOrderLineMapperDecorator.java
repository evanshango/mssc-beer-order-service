package com.codewithevans.msscbeerorderservice.web.mappers;

import com.codewithevans.msscbeerorderservice.domain.BeerOrderLine;
import com.codewithevans.msscbeerorderservice.services.beer.BeerService;
import com.codewithevans.brewery.model.BeerDto;
import com.codewithevans.brewery.model.BeerOrderLineDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public abstract class BeerOrderLineMapperDecorator implements BeerOrderLineMapper {

    private BeerService beerService;
    private BeerOrderLineMapper beerOrderLineMapper;

    @Autowired
    public void setBeerService(BeerService beerService) {
        this.beerService = beerService;
    }

    @Autowired
    public void setBeerOrderLineMapper(BeerOrderLineMapper beerOrderLineMapper) {
        this.beerOrderLineMapper = beerOrderLineMapper;
    }

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
        BeerOrderLineDto dto = beerOrderLineMapper.beerOrderLineToDto(line);
        Optional<BeerDto> beerDtoOptional = beerService.getBeerByUpc(line.getUpc());

        beerDtoOptional.ifPresent(beerDto -> {
            dto.setBeerId(beerDto.getId());
            dto.setBeerName(beerDto.getBeerName());
            dto.setBeerStyle(beerDto.getBeerStyle());
            dto.setPrice(beerDto.getPrice());
        });
        return dto;
    }
}
