package com.codewithevans.msscbeerorderservice.web.model;

public enum BeerOrderStatusEnum {
    NEW, VALIDATED, VALIDATION_EXCEPTION, ALLOCATED, ALLOCATION_EXCEPTION, PENDING_INVENTORY, PICKED_UP,
    DELIVERED, DELIVERY_EXCEPTION
}