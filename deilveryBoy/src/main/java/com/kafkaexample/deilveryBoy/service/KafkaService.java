package com.kafkaexample.deilveryBoy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafkaexample.deilveryBoy.config.AppConstants;

import ch.qos.logback.classic.Logger;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private Logger logger = (Logger) LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocationProducer(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        this.logger.info("location produced");
        return true;
    }
}
