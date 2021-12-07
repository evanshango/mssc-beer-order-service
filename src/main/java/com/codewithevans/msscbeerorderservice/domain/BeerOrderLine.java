package com.codewithevans.msscbeerorderservice.domain;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BeerOrderLine extends BaseEntity {

    private String beerName;
    private String upc;
    private Integer orderQuantity = 0;
    private Integer quantityAllocated = 0;
    @ManyToOne
    private BeerOrder beerOrder;
    private UUID beerId;

    @Builder
    public BeerOrderLine(
            UUID id, Long version, Timestamp createdAt, Timestamp updatedAt, BeerOrder beerOrder, UUID beerId,
            Integer orderQuantity, Integer quantityAllocated
    ) {
        super(id, version, createdAt, updatedAt);
        this.beerOrder = beerOrder;
        this.beerId = beerId;
        this.orderQuantity = orderQuantity;
        this.quantityAllocated = quantityAllocated;
    }
}