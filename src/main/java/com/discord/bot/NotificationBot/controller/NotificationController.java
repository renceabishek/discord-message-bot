package com.discord.bot.NotificationBot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class NotificationController {

    @GetMapping
    public String values() {
        return "success";
    }
}
