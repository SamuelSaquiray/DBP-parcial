package net.royal.spring.parcialdbp.CampusEats.rest;

import net.royal.spring.parcialdbp.CampusEats.Service.CampusEatsService;
import net.royal.spring.parcialdbp.CampusEats.dto.Product;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CampusEats {
    private final CampusEatsService campusEatsService;
    public CampusEats(CampusEatsService campusEatsService) {
        this.campusEatsService = campusEatsService;
    }
    @PostMapping("/stores/{storeId}/products")

    public ResponseEntity<Product> getProductsByStoreId(RequestBody producto,RequestParam storeId) {
        Product product = campusEatsService.getProductsByStoreId(producto,storeId);
        return ResponseEntity.ok(product);
    }
    @GetMapping("/products")

    public ResponseEntity<Page<Product>> getAllProducts() {
        Page<Product> products = campusEatsService.getAllProducts();
        return ResponseEntity.ok(products);
    }


}

