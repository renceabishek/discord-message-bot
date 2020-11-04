package com.discord.bot.NotificationBot.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("discord")
@Getter
@Data
public class DiscordProperties {
    private String key;
}
