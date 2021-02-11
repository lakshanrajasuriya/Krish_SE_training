package lk.lakshan.booking.customerservice.service;

import lk.lakshan.booking.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
