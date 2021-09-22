package com.hbc.edd.ivService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NetworkAvailability {
    private String earliestShipTs;
    private String latestShipTs;
    private String deliveryMethod;
    private Long totalAvailableQuantity;
    private Long onhandAvailableQuantity;
    private String onhandEarliestShipTs;
    private String onhandLatestShipTs;
    private Long futureAvailableQuantity;
    private String futureEarliestShipTs;
    private String futureLatestShipTs;
    private String distributionGroupId;
    private String alertLevel;
    private Long alertQuantity;
    private Integer thresholdLevel;
    private String thresholdType;
    private Long thresholdQuantity;
}
