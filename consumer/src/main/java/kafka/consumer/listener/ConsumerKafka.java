package kafka.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class ConsumerKafka {

    @KafkaListener(topics = "${kafkaTopic}", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consuming message {}", message);
    }
}