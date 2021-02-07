package com.lakshan.actuatordemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String viewUser() {
        return "Hello Lakshan!";
    }
}
