package com.informatics.bookstore.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 16)
    private String status;

    @OneToMany(mappedBy = "productStatus")
    @JsonIgnoreProperties("productStatus")
    private Set<Product> products;
}

enum Statuses{
    OFFICEPROCCESING, TRANSIT, DELIVERED, RECIEVED
}
