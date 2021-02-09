package com.lakshan.bookingengine.bookingengine.repository;

import com.lakshan.bookingengine.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
