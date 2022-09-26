package com.example.news.api.jwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJWT {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

}
