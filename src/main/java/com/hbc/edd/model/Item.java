package com.hbc.edd.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private String itemId;
    private String itemType;
    private String itemUPC;
    private String procutClass;
    private String unitOfMesure;
}