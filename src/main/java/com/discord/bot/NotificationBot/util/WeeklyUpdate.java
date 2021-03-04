package com.discord.bot.NotificationBot.util;

import com.discord.bot.NotificationBot.Repository.DiscordRepository;
import org.javacord.api.DiscordApi;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeeklyUpdate {

    private DiscordRepository discordRepository;

    public WeeklyUpdate(DiscordRepository discordRepository) {
        this.discordRepository = discordRepository;
    }

    @Scheduled(cron = "0 * * * * *")
    public void Testingschedule() {
        DiscordApi api = discordRepository.getDiscordApi();
        api.addMessageCreateListener(event -> {
            System.out.println("I'm Welcoming you each and every one min");
               // event.getChannel().sendMessage("I'm Welcoming you each and every one min");

        });

    }
}
