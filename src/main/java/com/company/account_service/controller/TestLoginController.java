package com.company.account_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestLoginController {

    @RequestMapping(value = "/api/v1/login", method = RequestMethod.POST)
    public String login(@RequestBody Object body){
        System.out.println("login body: " + body.toString());
        return "success";
    }
}
