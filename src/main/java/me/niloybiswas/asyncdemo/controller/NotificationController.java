package me.niloybiswas.asyncdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.niloybiswas.asyncdemo.service.NotificationService;

@RestController
@RequestMapping("/api")
public class NotificationController {

    @Autowired
    private NotificationService service;
    
    @GetMapping("/send")
    public ResponseEntity<?> sendMesssage(@RequestParam String message) throws InterruptedException {
        service.sendTextMessage(message);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Message sent successfully!");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
}
