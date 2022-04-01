package com.kemsdev.springdatarelationships.service;

import com.kemsdev.springdatarelationships.model.Address;
import com.kemsdev.springdatarelationships.model.Book;
import com.kemsdev.springdatarelationships.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses(){
        return addressRepository.findAll();
    }

    public Address getBookById(long id){
        return addressRepository.findById(id).orElseThrow(() -> new NullPointerException("Address is not found. By Id : " + id));
    }

}
