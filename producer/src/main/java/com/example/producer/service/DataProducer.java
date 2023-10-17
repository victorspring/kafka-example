package com.example.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DataProducer {

    public static final String TOPIC = "data";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public DataProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String data) {
        kafkaTemplate.send(TOPIC, data);
    }
}