package org.samasama.wikimedia.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class WikimediaTopicConfig {
    static final public String WIKIMEDIA_TOPIC = "wikimedia-stream";

    @Bean
    public NewTopic testTopic() {
        return TopicBuilder
                .name(WIKIMEDIA_TOPIC)
                .build();
    }
}
