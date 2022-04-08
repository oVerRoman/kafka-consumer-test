package com.simbirsoft.kafkaconsumertest.listener;

import com.simbirsoft.kafkaconsumertest.model.EmployeeDTO;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "employee")
    public void orderListener(ConsumerRecord<Long, EmployeeDTO> record) {
        System.out.println(record.partition());
        System.out.println(record.key());
        System.out.println(record.value());
    }
}
