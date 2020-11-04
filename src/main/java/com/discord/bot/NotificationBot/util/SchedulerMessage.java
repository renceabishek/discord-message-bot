package com.discord.bot.NotificationBot.util;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class SchedulerMessage {


    public static void scheduleMessage(String key) {
        DiscordApi api = new DiscordApiBuilder().setToken(key).login().join();
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("Abishek here")) {
                event.getChannel().sendMessage("Welcome Abishek");
            }
        });
        System.out.println("you can invite the bot by using following url " + api.createBotInvite());
    }
}
