package org.samasama.wikimedia.consumer.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Slf4j
@Service
public class WikimediaConsumer {
    @KafkaListener(topics = "wikimedia-stream", groupId = "samasama-group")
    public void consumeJsonMsg(String msg) {
        log.info(format("Consuming message from wikimedia-stream Topic: %s", msg));
    }
}
