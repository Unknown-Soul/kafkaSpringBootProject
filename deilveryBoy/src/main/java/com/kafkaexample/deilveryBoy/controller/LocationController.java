package com.kafkaexample.deilveryBoy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * LocationController
 */
@RestController
@RequestMapping("/location")
public class LocationController {
    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        
        return entity;
    }
    
}