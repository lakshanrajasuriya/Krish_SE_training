package com.lakshan.bookingengine.bookingengine.controller;

import com.lakshan.bookingengine.bookingengine.service.ProfileService;
import com.lakshan.bookingengine.commons.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('create_profile')")
    public Customer save(@RequestBody Customer customer) {
        return profileService.save(customer);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_operator')")
    public ResponseEntity<Customer> getById(@RequestParam int id) {
        Customer customer = profileService.fetchCustomerById(id);
        if (customer == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().body(customer);
        }
    }

    @RequestMapping(value = "/profiles",method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('read_profile')")
    public List<Customer> fetch(){
        return profileService.fetchAllProfiles();
    }
}
