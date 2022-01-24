package ru.netology.graphics.image;

import java.util.HashMap;
import java.util.Map;

public class ColorConverter implements TextColorSchema{

    private Map<Integer, Character> mapper = new HashMap<>();
    private int color;
    private double k = 9d / 256d;

    public void initMap() {
        mapper.put(8, '-');
        mapper.put(7, '◌');
        mapper.put(6, '☉');
        mapper.put(5, '○');
        mapper.put(4, '◎');
        mapper.put(3, '◍');
        mapper.put(2, '◉');
        mapper.put(1, '●');
        mapper.put(0, '▇');
    }

    @Override
    public char convert(int color) {
        initMap();
        int intColor = (int) (color * k);
        return mapper.get(intColor);
    }
}
