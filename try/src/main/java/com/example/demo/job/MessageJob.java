package com.example.demo.job;

import com.example.demo.service.MessageSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageJob {

    //EmailService

    private final MessageSender messageSender;

    @Scheduled(fixedDelay = 10000)
    private void sendAvailableEmails() {
        System.out.println("An email sending job has started..."); // TODO replace with log.info

        //TODO 1.: megkeressük a nem küldött emaileket
        //TODO 2.: EmailService.findAllSendableEmail() -> List<Email>
        //TODO 3.: végigiterálunk a listán, ha van eleme

        //messageSender.send();


    }
}
