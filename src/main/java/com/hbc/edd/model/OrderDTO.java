package com.hbc.edd.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String organizationCode;

    private String basketId;

    private OrderLinesDTO orderLines;

    private Assignments assignments;


}