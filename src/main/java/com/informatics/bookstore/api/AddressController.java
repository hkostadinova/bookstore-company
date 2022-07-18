package com.informatics.bookstore.api;

import com.informatics.bookstore.entity.Address;
import com.informatics.bookstore.service.AddressService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    private AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }

    @GetMapping("/addresses")
    public List<Address> getAddresses(){
        return service.getAddresses();
    }
}
