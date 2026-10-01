package net.royal.spring.parcialdbp.CampusEats.dto;

import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class ProductoDTO {

    @NotNull()
    @DecimalMin(value = "0.01", message = "El precio debe ser positivo")
    @DecimalMax(value = "99999.99", message = "El precio es demasiado alto")
    private BigDecimal precio;

    @Min(value = 1, message = "El stock mínimo es 1")
    @Max(value = 1000, message = "El stock máximo es 1000")
    private int stock;

    @Email(message = "El formato del email es incorrecto")
    @NotBlank(message = "El email del proveedor es obligatorio")
    private String emailProveedor;

    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "El código debe tener el
    formato XXX-XXX-XXXX")
    private String codigoProducto;


    @Past(message = "La fecha de fabricación debe ser una fecha pasada")
    private java.time.LocalDate fechaFabricacion;
}