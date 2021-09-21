package com.hbc.edd.eddService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShipToAddress {
    private String city;
    private String country;
    private String province;
    private String zipCode;
}
