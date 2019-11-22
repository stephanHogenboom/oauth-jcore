package com.jcore.deltasquad.oauth.endpoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/hello")
public class Hello {


    @GetMapping("/world")
    public String getWorld() {
        return "world";
    }
}
