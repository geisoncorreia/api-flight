package com.apiflights.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDTO {

    private String id;
    @NotEmpty(message = "flyFrom não pode ser vazio")
    private String flyFrom;

    @NotEmpty(message = "flyTo não pode ser vazio")
    private String flyTo;

    @NotEmpty(message = "curr não pode ser vazio")
    private String curr;

    private BigDecimal price;
}
