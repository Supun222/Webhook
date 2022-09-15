package com.example.webhook_demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebhookController {


    @PostMapping("/webhook") // http://localhost:8080/api/webhook
    public ResponseEntity<String> print(@RequestBody String requestBody){
        System.out.println("#### Webhook ###" + requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
}
