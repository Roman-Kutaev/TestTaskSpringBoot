package com.example.testTask.service;

import com.example.testTask.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceModule {

    public ResponseEntity<?> doEquals(User user) {
        if (user.getId() == 1) {
            user.setFio("Test Testov");
            return ResponseEntity.ok(user);
        } else
            return ResponseEntity.ok().body(null);
    }
}
