package com.discord.bot.NotificationBot;

import com.discord.bot.NotificationBot.util.SchedulerMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class NotificationBotApplication {


    public static void main(String[] args) {

        SpringApplication.run(NotificationBotApplication.class, args);
        SchedulerMessage.scheduleMessage();
    }

}
