package com.example.Demo.Basic.Authentication.endpoint;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/user",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public interface IUserEndpoint {

    @GetMapping()
    String getDataUser();

    @GetMapping("/register")
    String registerUser();

}
