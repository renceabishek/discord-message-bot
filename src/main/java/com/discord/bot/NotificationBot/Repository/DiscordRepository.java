package com.discord.bot.NotificationBot.Repository;

import com.discord.bot.NotificationBot.config.DiscordProperties;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class DiscordRepository {

    private DiscordProperties discordProperties;

    public DiscordRepository(DiscordProperties discordProperties) {
        this.discordProperties = discordProperties;
    }

    @Bean
    public DiscordApi getDiscordApi() {
        return new DiscordApiBuilder().setToken(discordProperties.getKey()).login().join();
    }
}
