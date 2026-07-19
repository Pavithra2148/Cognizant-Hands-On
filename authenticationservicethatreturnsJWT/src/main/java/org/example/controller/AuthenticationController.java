package org.example.controller;

import org.example.model.User;
import org.example.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody User user) {

        if ("admin".equals(user.getUsername())
                && "admin123".equals(user.getPassword())) {

            return JwtUtil.generateToken(user.getUsername());
        }

        return "Invalid Credentials";
    }
}