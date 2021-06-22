package br.com.max.testingspringkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TestingSpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingSpringKafkaApplication.class, args);
	}

}
