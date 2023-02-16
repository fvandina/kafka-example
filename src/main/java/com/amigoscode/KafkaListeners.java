package com.amigoscode;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(
            topics = "amigoscode",
            groupId = "grooupId",
            containerFactory = "messageFactory"
    )
    public void listen(Message data) {
        System.out.println("Listener received: " + data + " 👀");
    }
}
