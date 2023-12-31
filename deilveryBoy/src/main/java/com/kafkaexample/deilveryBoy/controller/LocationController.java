package com.kafkaexample.deilveryBoy.controller;

import org.springframework.web.bind.annotation.RestController;
import com.kafkaexample.deilveryBoy.service.KafkaService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;;


/**
 * LocationController
 */
@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {
        this.kafkaService.updateLocationProducer("( "+Math.random()*100+" , "+Math.random()*100+" )");
        return new ResponseEntity<>(Map.of("mesasge","location updated"),HttpStatus.OK);
    }
    
}