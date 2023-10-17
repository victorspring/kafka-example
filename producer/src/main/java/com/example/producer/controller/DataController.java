package com.example.producer.controller;

import com.example.producer.service.DataProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataProducer dataProducer;

    @Autowired
    public DataController(DataProducer iotDataProducer) {
        this.dataProducer = iotDataProducer;
    }

    @PostMapping
    public void sendData(@RequestBody String data) {
        dataProducer.send(data);
    }
}