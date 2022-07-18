package com.informatics.bookstore.api;

import com.informatics.bookstore.entity.Product;
import com.informatics.bookstore.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
}
