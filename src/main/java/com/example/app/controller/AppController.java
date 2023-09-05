package com.example.app.controller;

import com.example.app.config.LogExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AppController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @LogExecutionTime(additionalMessage = "This is a Get Method")
    public ResponseEntity<String> getData(){
        return new ResponseEntity<>("Success Message", HttpStatus.OK);
    }
}
