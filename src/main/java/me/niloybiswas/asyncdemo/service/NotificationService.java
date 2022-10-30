package me.niloybiswas.asyncdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NotificationService {
    
    @Async
    public void sendTextMessage(String message) throws InterruptedException {

        TimeUnit.SECONDS.sleep(5);
        log.info(message + " | Thread: " + Thread.currentThread().getName());
        System.out.println(10 / 0);

    }

}
