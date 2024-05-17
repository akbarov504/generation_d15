package uz.pdp;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class Keyboards {
    public static ReplyKeyboardMarkup homeMenu() {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton frontend = new KeyboardButton("Frontend");
        KeyboardButton python = new KeyboardButton("Python");
        KeyboardButton java = new KeyboardButton("Java");

        row1.add(frontend);
        row1.add(python);
        row2.add(java);

        markup.setResizeKeyboard(true);
        markup.setKeyboard(List.of(row1, row2));

        return markup;
    }

    public static ReplyKeyboardMarkup optionMenu(List<Answer> answers) {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton a = new KeyboardButton(answers.get(0).getAnswer());
        KeyboardButton b = new KeyboardButton(answers.get(1).getAnswer());
        KeyboardButton c = new KeyboardButton(answers.get(2).getAnswer());
        KeyboardButton d = new KeyboardButton(answers.get(3).getAnswer());

        row1.add(a);
        row1.add(b);
        row2.add(c);
        row2.add(d);

        markup.setResizeKeyboard(true);
        markup.setKeyboard(List.of(row1, row2));
        return markup;
    }
}
