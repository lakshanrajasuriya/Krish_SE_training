package com.lakshan.bookingmanager.bookingmanager.controller;

import com.lakshan.bookingmanager.bookingmanager.model.BookingValidateConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookingValidateController {
    @Autowired
    BookingValidateConfiguration bookingValidateConfiguration;

    @RequestMapping("/booking")
    public String getConfig(Model model){
        model.addAttribute("discount",bookingValidateConfiguration.getDiscount());
        model.addAttribute("min",bookingValidateConfiguration.getMinimumBeds());
        return "booking";
    }
}
