package Lessons.Lessons7;

import Lessons.Lessons7.imp.Fahrenheit;
import Lessons.Lessons7.imp.Kelvin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Temperature temperature;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите метод расчета");

        String method = console.next();

        System.out.println("Введите температуру");

        int degree = console.nextInt();

        switch (method){
            case "K":{
                temperature = new Kelvin();
                temperature.conversion(degree);
                break;
            }
            case "F":{
                temperature = new Fahrenheit();
                temperature.conversion(degree);
                break;
            }
        }

    }

}
