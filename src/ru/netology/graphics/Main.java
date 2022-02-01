package ru.netology.graphics;

import ru.netology.graphics.image.*;
import ru.netology.graphics.server.GServer;

public class Main {
    private static final char[] DEFAULT_COLOR = new char[]{'#', '$', '@', '%', '*', '+', '-', '\''};
    private static final char[] OTHER_COLOR = new char[]{'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};

    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter(); // Создайте тут объект вашего класса конвертера
//      TextColorSchema schema = new ColorConverter(OTHER_COLOR);
//      converter.setTextColorSchema(schema); // передача другой символьной схемы
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем


        // Или то же, но с выводом на экран:
//        String url = "https://i.ibb.co/6DYM05G/edu0.jpg";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}