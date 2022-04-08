package com.simbirsoft.kafkaconsumertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class KafkaConsumerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerTestApplication.class, args);
		System.out.println("Kafka-consumer starts");
	}
}
