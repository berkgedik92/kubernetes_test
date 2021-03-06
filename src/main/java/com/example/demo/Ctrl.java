package com.example.demo;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctrl {

    @GetMapping("ping")
    public ResponseEntity<String> ping() {
        Date d = new Date();
        System.out.println(d.toString());
        return new ResponseEntity<>("Ok from " + DemoApplication.aa, HttpStatus.OK);
    }
}
