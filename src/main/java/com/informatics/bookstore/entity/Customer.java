package com.informatics.bookstore.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String firstName;


    @Column(nullable = false)
    private String lastName;


    @Column(nullable = false)
    private String tel;

    @OneToMany(mappedBy = "sender")
    @JsonIgnoreProperties("sender")
    private Set<Product> productsSent;

    @OneToMany(mappedBy = "receiver")
    @JsonIgnoreProperties("receiver")
    private Set<Product> productsReceive;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Address address;
}
