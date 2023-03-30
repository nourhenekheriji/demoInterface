package com.example.talan.demoInterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemoInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoInterfaceApplication.class, args);
    }


    @GetMapping("/showMessage")
    public String getSrtring() {
        return "hello word aymen";
    }

}
