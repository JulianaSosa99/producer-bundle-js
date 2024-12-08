package com.kafka_bundle.osgiA.Controller;


import com.kafka_bundle.osgiA.MessageRequest;
import com.kafka_bundle.osgiA.Producer.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final ProducerService producerService;

    public KafkaController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody MessageRequest messageRequest) {
        producerService.sendMessage(messageRequest.getMessage());
        return "Mensaje publicado: " + messageRequest.getMessage();
    }
}