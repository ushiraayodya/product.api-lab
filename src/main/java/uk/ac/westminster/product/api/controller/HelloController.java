package uk.ac.westminster.product.api.controller;

import org.apache.commons.lang3.Strings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello from spring Boot!";
    }

    @GetMapping("/Goodbye")
    public String Goodbye() {
        return "Goodbye from Spring Boot ! ";
    }

    @GetMapping("/status")
    public String status() {
        return "API is running";
    }
}