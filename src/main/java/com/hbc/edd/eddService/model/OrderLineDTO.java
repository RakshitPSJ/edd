package com.hbc.edd.eddService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineDTO {
    private String fulFillmentType;
    private String leaveOfService;
    private String deliveryMethod;
    private String carrierServiceCode;
    private String lineId;
    private Long requiredQty;
    private Item item;
    private Assignments assignments;
}