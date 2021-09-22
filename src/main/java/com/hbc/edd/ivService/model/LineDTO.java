package com.hbc.edd.ivService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LineDTO {
    private String lineId;
    private NetworkAvailabilities networkAvailabilities;
}
