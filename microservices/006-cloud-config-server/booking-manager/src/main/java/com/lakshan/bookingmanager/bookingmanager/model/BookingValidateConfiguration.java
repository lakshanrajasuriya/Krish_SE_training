package com.lakshan.bookingmanager.bookingmanager.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class BookingValidateConfiguration {
    @Autowired
    Environment environment;

    public String getDiscount() {
        return environment.getProperty("room.price.discount");
    }

    public String getMinimumBeds() {
        return environment.getProperty("room.beds.min");
    }
}
