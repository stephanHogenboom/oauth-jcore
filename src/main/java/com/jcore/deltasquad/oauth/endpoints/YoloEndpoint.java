package com.jcore.deltasquad.oauth.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yolo")
public class YoloEndpoint {

    @GetMapping("/public")
    public String getPublicYolo() {
        return "Public Yolo!";
    }

    @GetMapping("/private")
    public String getPrivateYolo() {
        return "Private  Yolo!";
    }

    @GetMapping("/private-scoped")
    public String getPrivateScopedYolo() {
        return "Super private Yolo met scope read_user!";
    }
}
