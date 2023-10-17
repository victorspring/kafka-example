package com.example.consumer.listener;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "data", groupId = "group-1")
public class DataConsumer {
    @KafkaHandler
    public void consumeData(String data) {
        System.out.println("Received IoT Data: " + data);
    }
}