package uz.pdp;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handlers {
    public static void handler(Update update, GenerationD15Bot bot) throws TelegramApiException {
        if (update.hasMessage()) {
            String chatId = "" + update.getMessage().getChatId();
            if (update.getMessage().hasText()) {
                if (update.getMessage().getText().equals("/start")) {
                    SendMessage message = new SendMessage();
                    message.setChatId(chatId);
                    message.setText("Hi\nWelcome to our Test Bot");
                    message.setReplyMarkup(Keyboards.homeMenu());
                    bot.execute(message);
                } else if (update.getMessage().getText().equals("Frontend")) {
                    int count = 0;
                    int r = 1 + (int)(Math.random() * 10);

                    HashMap<String, List<Answer>> map = Data.getQuestionFrontend();
                    for (Map.Entry<String, List<Answer>> me : map.entrySet()) {
                        count++;
                        if (count == r) {
                            SendMessage message = new SendMessage();
                            message.setChatId(chatId);
                            message.setText(me.getKey());
                            message.setReplyMarkup(Keyboards.optionMenu(me.getValue()));
                            bot.execute(message);
                            break;
                        }
                    }
                } else if (update.getMessage().getText().equals("1995") || update.getMessage().getText().equals("JS") || update.getMessage().getText().equals("4") || update.getMessage().getText().equals("document") || update.getMessage().getText().equals("getElementById(\"\")") || update.getMessage().getText().equals("style") || update.getMessage().getText().equals("string") || update.getMessage().getText().equals("sichqonchaning bosilishi") || update.getMessage().getText().equals("let") || update.getMessage().getText().equals("%")) {
                    SendMessage message = new SendMessage();
                    message.setChatId(chatId);
                    message.setText("Congratulations, you found it!");
                    message.setReplyMarkup(Keyboards.homeMenu());
                    bot.execute(message);
                } else if (update.getMessage().getText().equals("Python")) {
                    int count = 0;
                    int r = 1 + (int)(Math.random() * 10);

                    HashMap<String, List<Answer>> map = Data.getQuestionPython();
                    for (Map.Entry<String, List<Answer>> me : map.entrySet()) {
                        count++;
                        if (count == r) {
                            SendMessage message = new SendMessage();
                            message.setChatId(chatId);
                            message.setText(me.getKey());
                            message.setReplyMarkup(Keyboards.optionMenu(me.getValue()));
                            bot.execute(message);
                            break;
                        }
                    }
                } else if (update.getMessage().getText().equals("print(\"Salom dunyo\")") || update.getMessage().getText().equals("#Bu izoh") || update.getMessage().getText().equals("my_var") || update.getMessage().getText().equals("x = 5") || update.getMessage().getText().equals(".py") || update.getMessage().getText().equals("x = 2.8") || update.getMessage().getText().equals("print(type(x))") || update.getMessage().getText().equals("def myFunction();") || update.getMessage().getText().equals("x = sub(\"Salom\", 0, 1)") || update.getMessage().getText().equals("strip()")) {
                    SendMessage message = new SendMessage();
                    message.setChatId(chatId);
                    message.setText("Congratulations, you found it!");
                    message.setReplyMarkup(Keyboards.homeMenu());
                    bot.execute(message);
                } else if (update.getMessage().getText().equals("Java")) {
                    int count = 0;
                    int r = 1 + (int)(Math.random() * 10);

                    HashMap<String, List<Answer>> map = Data.getQuestionJava();
                    for (Map.Entry<String, List<Answer>> me : map.entrySet()) {
                        count++;
                        if (count == r) {
                            SendMessage message = new SendMessage();
                            message.setChatId(chatId);
                            message.setText(me.getKey());
                            message.setReplyMarkup(Keyboards.optionMenu(me.getValue()));
                            bot.execute(message);
                            break;
                        }
                    }
                } else if (update.getMessage().getText().equals("dasturni (yoki uning qismlarini) boshqa muhitda/muhitda ishga tushirish qobiliyati. Bu turli xil operatsion tizimlarda ishlash qobiliyatini va oddiygina bir xil operatsion tizimga ega, ammo turli xil sozlamalar bilan turli xil kompyuterlarga o'tkazish qobiliyatini anglatishi mumkin;") || update.getMessage().getText().equals("dasturiy ta'minotning bir nechta apparat platformalari yoki operatsion tizimlar bilan ishlash qobiliyati.") || update.getMessage().getText().equals("ba'zi server ilovalari;") || update.getMessage().getText().equals("ham tuzilgan, ham talqin qilingan.") || update.getMessage().getText().equals("o‘zgaruvchi deklaratsiya vaqtida tur bilan bog‘lanadi va keyinchalik turini o‘zgartirib bo‘lmaydi;") || update.getMessage().getText().equals("Java-da barcha ma'lumotlar turlari ob'ektlardir;") || update.getMessage().getText().equals("Java-da siz ko'p tarmoqli ilovalar yaratishingiz mumkin;") || update.getMessage().getText().equals("Java dasturlarini bajarish, shuningdek, ilovalarning bajarilishi xavfsizligini nazorat qilish;") || update.getMessage().getText().equals("Java dasturlarini bajarish;") || update.getMessage().getText().equals("ishlab chiquvchilarga dasturlar yaratish, ularni kompilyatsiya qilish va ishga tushirish imkonini beradi.")) {
                    SendMessage message = new SendMessage();
                    message.setChatId(chatId);
                    message.setText("Congratulations, you found it!");
                    message.setReplyMarkup(Keyboards.homeMenu());
                    bot.execute(message);
                } else {
                    SendMessage message = new SendMessage();
                    message.setChatId(chatId);
                    message.setText("Wrong answer!");
                    message.setReplyMarkup(Keyboards.homeMenu());
                    bot.execute(message);
                }
            }
        }
    }
}
