package com.lakshan.bookingengine.bookingengine.service;

import com.lakshan.bookingengine.commons.model.Customer;

public interface ProfileService {
    Customer save(Customer customer);

    Customer fetchCustomerById(int id);
}
