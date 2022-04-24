package Lessons.Lessons7.imp;

import Lessons.Lessons7.Temperature;

public class Kelvin implements Temperature {

    @Override
    public void conversion(int celsius) {
        double kelvin = (celsius+273.5);

        System.out.println("В кельвинах = " + kelvin);
    }

}
