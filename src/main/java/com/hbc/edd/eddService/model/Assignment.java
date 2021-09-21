package com.hbc.edd.eddService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {
    private LocalDateTime estmatedDeliveryStartDate;
    private LocalDateTime estimatedDeliveryEndDate;
    private String levelOfService;
    private String carrierServiceCode;

    private Long availableQty;
    private String shipNode;
}