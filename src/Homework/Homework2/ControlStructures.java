package Homework.Homework2;

import java.util.Scanner;

public class ControlStructures {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Ввидеите номер месяца");
        int numberMonth = console.nextInt();

        searchMonthWithSwitch(numberMonth); //Задача 1
        searchMonthWithIfElse(numberMonth); //Задача 2


        System.out.println("Введите число");
        int number = console.nextInt(); //Задача 3

        evenOrOddNumber(number);

        System.out.println("Введите температуру на улице");
        int temperature = console.nextInt();
        temperature(temperature); //Задача 4

        System.out.println("Введите номер цвета радуги");
        int numberColor = console.nextInt();
        rainbow(numberColor); //Задача 5
    }

    public static void searchMonthWithSwitch(int number) {

        System.out.println("Поиск поры года с помощью конструкции switch-case");

        switch (number) {

            case (1):
            case (2):
            case (12): {
                System.out.println("Месяц попал в зимнюю пору года");
                break;
            }

            case (3):
            case (4):
            case (5): {
                System.out.println("Месяц попал в весеннюю пору года");
                break;
            }

            case (6):
            case (7):
            case (8): {
                System.out.println("Месяц попал в летнюю пору года");
                break;
            }

            case (9):
            case (10):
            case (11): {
                System.out.println("Месяц попал в осеннюю пору года");
                break;
            }

            default:
                System.out.println("Вы ввели неправильное число");

        }
    }

    public static void searchMonthWithIfElse(int number) {
        System.out.println();
        System.out.println("Поиск поры года с помощью конструкции if-else-if");

        if (number == 1 || number == 2 || number == 12) {
            System.out.println("Месяц попал в зимнюю пору года");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Месяц попал в весеннюю пору года");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Месяц попал в летнюю пору года");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Месяц попал в осеннюю пору года");
        } else {
            System.out.println("Вы ввели неправильное число");
        }
    }

    public static void evenOrOddNumber(int number) {
        System.out.println();
        System.out.println("Задача: определить четное число или нечетное");

        if (number % 2 == 0) {
            System.out.println("Введенное число " + number + " - четное");
        } else {
            System.out.println("Введенное число " + number + " - нечетное");
        }
    }

    public static void temperature(int t) {

        System.out.println();
        System.out.println("Задача: температура на улице");

        if (t > -5) {
            System.out.println("На улице тепло");
        } else if ( t <= (-5) && t > (-20)) {
            System.out.println("На улице «Нормально»");
        } else if (t <= -20){
            System.out.println("На улице «Холодно»");
        }
    }

    public static void rainbow (int numberColor){

        System.out.println();
        System.out.println("Задача: определить цвет радуги");

        switch (numberColor){

            case (1):
                System.out.println("Выбран красный цвет");
                break;
            case (2):
                System.out.println("Выбран оранжевый цвет");
                break;
            case (3):
                System.out.println("Выбран желтый цвет");
                break;
            case (4):
                System.out.println("Выбран заленый цвет");
                break;
            case (5):
                System.out.println("Выбран голубой цвет");
                break;
            case (6):
                System.out.println("Выбран синий цвет");
                break;
            case (7):
                System.out.println("Выбран фиолетовый цвет");
                break;

            default:
                System.out.println("Стоит сходить к окулисту :c");
        }
    }
}
