package com.amdocs.assignment.controller;

import com.amdocs.assignment.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AuthorizationController {
    private final UserRepository repository;

    AuthorizationController(UserRepository repository) {
        this.repository = repository;
    }

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

    @PostMapping("/home")
    Users newUser(@RequestBody Users user) {
        return repository.save(user);
    }

    @PutMapping("/home/{user}")
    Users replaceUser(@RequestBody Users user, @PathVariable String username) {

        return repository.findbyusername(username)
                .map(users -> {
                    user.setpassword(newUser().getpassword());
                    user.setaddress(newUser().getaddress());
                    user.setphoneno(newUser().getphoneno());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    user.setusername(username);
                    return repository.save(user);
                });
    }

    @DeleteMapping("/home/{username}")
    void deleteUser(@PathVariable String username) {
        repository.deletebyusername(username);
    }

}
