package com.example.testTask.controller;

import com.example.testTask.entity.User;
import com.example.testTask.service.ServiceModule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    private final ServiceModule serviceModule;

    private static final Logger LOGGER = LogManager.getLogger(MainController.class);

    public MainController(ServiceModule serviceModule) {
        this.serviceModule = serviceModule;
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> index(@RequestBody User user) {

        return serviceModule.doEquals(user);
    }
}
