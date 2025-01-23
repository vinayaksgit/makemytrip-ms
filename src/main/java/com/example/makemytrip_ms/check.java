package com.example.makemytrip_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check {
    @GetMapping("/check")
    public String getData() {return  "Checkout" ; }
}