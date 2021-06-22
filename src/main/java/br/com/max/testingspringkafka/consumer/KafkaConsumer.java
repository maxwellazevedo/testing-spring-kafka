package br.com.max.testingspringkafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Slf4j
@Component
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);


    private String payload = null;


    @KafkaListener(topics="${topic}", groupId="my_group_id")
    public void getMessage(ConsumerRecord<?, ?> consumerRecord){
        LOGGER.info("Consumer message ='{}'", consumerRecord.toString());
        setPayload(consumerRecord.toString());

    }

    private void setPayload(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }

}
