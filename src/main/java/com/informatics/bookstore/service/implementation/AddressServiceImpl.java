package com.informatics.bookstore.service.implementation;

import com.informatics.bookstore.entity.Address;
import com.informatics.bookstore.repository.AddressRepository;
import com.informatics.bookstore.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private AddressRepository repo;

    public AddressServiceImpl(AddressRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Address> getAddresses() {
        return repo.findAll();
    }
}
