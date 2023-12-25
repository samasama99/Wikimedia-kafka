package org.samasama.wikimedia.producer.controller;

import org.samasama.wikimedia.producer.stream.WikimediaStreamConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
public record WikimediaController(WikimediaStreamConsumer streamConsumer) {
    @GetMapping
    public void publishToKafka() {
        streamConsumer().consumeStreamAndPublish();
    }
}
