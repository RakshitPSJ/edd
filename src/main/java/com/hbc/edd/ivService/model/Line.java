package com.hbc.edd.ivService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Line {
    private String lineId;
    private String itemId;
    private String unitOfMeasure;
    private String productClass;
    private String deliveryMethod;
    private String segment;
    private String segmentType;
    private String distributionGroupId;
}
