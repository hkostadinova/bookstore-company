package com.informatics.bookstore.service.implementation;


import com.informatics.bookstore.entity.Product;
import com.informatics.bookstore.repository.ProductRepository;
import com.informatics.bookstore.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> getProducts() {
        return repo.findAll();
    }
}
