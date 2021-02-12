package lk.lakshan.booking.customerservice.repository;

import lk.lakshan.booking.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
