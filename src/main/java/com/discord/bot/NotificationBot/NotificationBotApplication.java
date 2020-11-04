package com.discord.bot.NotificationBot;

import com.discord.bot.NotificationBot.config.DiscordProperties;
import com.discord.bot.NotificationBot.util.SchedulerMessage;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationBotApplication {

    private static DiscordProperties discordProperties;

    public NotificationBotApplication(DiscordProperties discordProperties) {
        this.discordProperties = discordProperties;
    }

    public static void main(String[] args) {

        SpringApplication.run(NotificationBotApplication.class, args);
        SchedulerMessage.scheduleMessage(discordProperties.getKey());
    }

}
