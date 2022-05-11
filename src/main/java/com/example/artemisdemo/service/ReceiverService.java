package com.example.artemisdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.json.Json;

@Service
public class ReceiverService {
    Logger log = LoggerFactory.getLogger(ReceiverService.class);

    @JmsListener(destination = "${jms.queue}")
    public void receiveMessage(String message) {
        System.out.println(message);
        log.info("Received message: ", message);
    }
}
