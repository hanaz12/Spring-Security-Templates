package com.security.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @GetMapping
    public ResponseEntity<String> UserGreetings() {
        return ResponseEntity.ok("Hello from secure end point for user roles");
    }
}
