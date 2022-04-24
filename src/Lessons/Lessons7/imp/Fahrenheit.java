package Lessons.Lessons7.imp;

import Lessons.Lessons7.Temperature;

public class Fahrenheit implements Temperature {

    @Override
    public void conversion(int celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("В фаренгейтах = " + fahrenheit);
    }

}
