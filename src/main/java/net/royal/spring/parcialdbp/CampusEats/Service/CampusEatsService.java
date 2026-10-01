package net.royal.spring.parcialdbp.CampusEats.Service;

import net.royal.spring.parcialdbp.CampusEats.dto.Porduct.productRequest;
import net.royal.spring.parcialdbp.CampusEats.dto.Product;
import net.royal.spring.parcialdbp.CampusEats.repository.CampusEatsRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.swagger2.mappers.ModelMapper;

import java.awt.print.Pageable;

@Service
public class CampusEatsService {
    private final CampusEatsRepository campusEatsRepository;
    private final ModelMapper modelMapper;
    public CampusEatsService(CampusEatsRepository productRepository,
                          ModelMapper modelMapper) {
        this.campusEatsRepository = productRepository;
        this.modelMapper = modelMapper;
    }
    public Product getProductsByStoreId(RequestBody producto, RequestParam storeId) {

    }

    public Page<Product> getAllProducts(){

    }

}