package uz.pdp;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class GenerationD15Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "praekt_d15_bot";
    }

    @Override
    public String getBotToken() {
        return "6528495946:AAH0Iw2z3n2vIDcdFpX6FzRsePP3e-XIHzw";
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
            Handlers.handler(update, this);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
}
