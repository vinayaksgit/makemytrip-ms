package com.example.makemytrip_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData() {return  "Please book your hotel ticket for shimla t 10% discount" ; }
}

