package com.codewithevans.msscbeerorderservice.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BeerOrderLineDto extends BaseItem {

    private String upc;
    private String beerName;
    private UUID beerId;
    private Integer orderQuantity = 0;

    @Builder
    public BeerOrderLineDto(
            UUID id, Integer version, OffsetDateTime createdAt, OffsetDateTime updatedAt, String upc, String beerName,
            UUID beerId, Integer orderQuantity
    ) {
        super(id, version, createdAt, updatedAt);
        this.upc = upc;
        this.beerName = beerName;
        this.beerId = beerId;
        this.orderQuantity = orderQuantity;
    }
}
