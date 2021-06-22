package br.com.max.testingspringkafka.controller;


import br.com.max.testingspringkafka.producer.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/produce")
public class ProducerController {

    final KafkaProducer producer;

    public ProducerController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping(value = "/{name}")
    public void produce(@PathVariable String name){
        producer.send(name);
    }
}