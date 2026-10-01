package net.royal.spring.parcialdbp.CampusEats.repository;

import net.royal.spring.parcialdbp.CampusEats.dto.Product;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public class CampusEatsRepository {

    public Page<Product> findAll(Pageable pageable) {
        return ;
    }
}
