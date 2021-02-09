package com.lakshan.bookingengine.bookingengine.service;

import com.lakshan.bookingengine.bookingengine.repository.CustomerRepository;
import com.lakshan.bookingengine.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer fetchCustomerById(int id) {
        Optional<Customer> customer=customerRepository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }

    @Override
    public List<Customer> fetchAllProfiles() {
        return customerRepository.findAll();
    }
}
