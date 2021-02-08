package com.lakshan.usermanager.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String viewUser() {
        return "Hello Lakshan Rajasuriya!";
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.POST)
    public String addUser(@PathVariable String name) {
        return name + " Added Successfully!";
    }
}
