package com.apiflights.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDTO {

    private String id;
    private String flyFrom;
    private String flyTo;
    private BigDecimal price;
}
