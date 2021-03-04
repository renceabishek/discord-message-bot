package com.discord.bot.NotificationBot.util;

import com.discord.bot.NotificationBot.Repository.DiscordRepository;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulerMessage {

    private static DiscordRepository discordRepository;

    public SchedulerMessage(DiscordRepository discordRepository) {
        this.discordRepository = discordRepository;
    }

    public static void scheduleMessage() {
        DiscordApi api = discordRepository.getDiscordApi();
        api.addMessageCreateListener(event -> {
            System.out.println("checking create message");
            if (event.getMessageContent().equalsIgnoreCase("hello")) {
                event.getChannel().sendMessage("Welcome Abishek");
            }
        });
        System.out.println("you can invite the bot by using following url " + api.createBotInvite());
    }
}
