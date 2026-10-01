package net.royal.spring.parcialdbp.CampusEats.dto;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class FoodOrder {
    private Integer id;
    private Integer customerId;
    private Integer productId;
    @Min(value = 1, message = "El stock mínimo es 1")
    private Integer quantity;
    private BigDecimal totalAmount;
    private ZonedDateTime createAt;
    private String status;
}
