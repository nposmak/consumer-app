package ru.nposmak.consumer.service.impl;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.nposmak.consumer.dto.DataDto;
import ru.nposmak.consumer.service.RabbitConsumerService;
import ru.nposmak.consumer.service.SaveParamService;

@Slf4j
@Service
@EnableRabbit
@Data
public class RabbitConsumerServiceImpl implements RabbitConsumerService {

    private final SaveParamService saveParamService;

    @RabbitListener(queues = "${rabbit.queue}")
    @Override
    public void readMessage(DataDto message) {
        log.info("reading message...");
        saveParamService.saveParams(message.getPressureDto(), message.getVolumeDto());
        log.info("message data saved...");
    }
}
