package com.hbc.edd.eddService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private ShipToAddress shipToAddress;
    private OrderLines orderLines;
    private String organizationCode;
    private String basketId;
    private String orderLevelEDDRequired;

}