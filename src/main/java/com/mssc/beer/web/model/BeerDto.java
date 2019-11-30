package com.mssc.beer.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {

    private UUID beerId;
    private Integer version;
    private String beerName;
    private BeerStyle beerStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantity;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
}
