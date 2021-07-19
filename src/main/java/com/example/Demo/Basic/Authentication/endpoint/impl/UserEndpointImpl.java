package com.example.Demo.Basic.Authentication.endpoint.impl;

import com.example.Demo.Basic.Authentication.endpoint.IUserEndpoint;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEndpointImpl implements IUserEndpoint {

    @Override
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getDataUser() {
        return "Data User";
    }

    @Override
    public String registerUser() {
        return "Register User";
    }

}
