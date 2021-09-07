package com.amdocs.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @GetMapping("/home/client")
    public String clientside(){
        return "Welcome to AMDOCS website";
    }

    @GetMapping("/home/developer")
    public String developerside(){
        return "Welcome to the core functionality of Amdocs";
    }

    @GetMapping("/home/manager")
    public String managerside(){
        return "Welcome to the organizing and planning";
    }

}
