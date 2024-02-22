package ru.nposmak.consumer.service;


import ru.nposmak.consumer.dto.DataDto;

public interface RabbitConsumerService {
    void readMessage(DataDto message);
}
