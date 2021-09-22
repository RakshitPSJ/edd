package com.hbc.edd.ivService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NetAvailabilityRequest {
    private String distributionGroupId;
    private Lines lines;
    private Boolean considerSafetyStock;
    private String segment;
    private String segmentType;
}
