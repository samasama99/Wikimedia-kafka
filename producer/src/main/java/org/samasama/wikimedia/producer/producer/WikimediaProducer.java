package org.samasama.wikimedia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.samasama.wikimedia.producer.config.WikimediaTopicConfig;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {
    public final KafkaTemplate<String, String> kafkaTemplate;

    public void publish(String msg) {
//        log.info(format("Publishing message to test Topic: %s", msg));
        kafkaTemplate.send(WikimediaTopicConfig.WIKIMEDIA_TOPIC, msg);
    }
}
