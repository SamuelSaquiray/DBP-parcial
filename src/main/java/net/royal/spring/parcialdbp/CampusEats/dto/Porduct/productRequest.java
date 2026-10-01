package net.royal.spring.parcialdbp.CampusEats.dto.Porduct;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class productRequest
{
    private String name;
    private BigDecimal price;
    @NotNull
    private Integer stock;

    public productRequest() {
        stock = 0;
    }
}
