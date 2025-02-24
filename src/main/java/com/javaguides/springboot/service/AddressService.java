package com.javaguides.springboot.service;

import com.javaguides.springboot.entity.Address;
import com.javaguides.springboot.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address){
        Address addressSavedToDB = this.addressRepository.save(address);
        return addressSavedToDB;
    }
}
