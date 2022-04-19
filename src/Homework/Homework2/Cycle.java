package Homework.Homework2;

import java.util.Scanner;

public class Cycle {

    public static void main(String[] args) {


        evenOrOddNumber(); //Задача 1
        fromFiveToOne(); //Задача 2

        Scanner console = new Scanner(System.in);
        System.out.println("Введите числа для подсчета суммы");
        int number = console.nextInt();

        sum(number); //Задача 3
        subsequence(); //Задача 4
        subsequence2(); //Задача 5
        pow(); //Задача 6
    }

    public static void evenOrOddNumber() {

        System.out.println("Задача 1");

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void fromFiveToOne() {

        System.out.println();
        System.out.println("Задача 2");

        for (int i = 5; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void sum(int number) {

        System.out.println();
        System.out.println("Задача 3");

        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum += i;
        }

        System.out.println("Сумма до введеного числа = " + sum);
    }

    public static void subsequence() {

        System.out.println();
        System.out.println("Задача 4");

        int number = 0;

        while (number < 98) {
            number = number + 7;
            System.out.println("number = " + number);
        }

    }

    public static void subsequence2(){

        System.out.println();
        System.out.println("Задача 5");

        int number = 5;

        for (int i = 1; i <=10; i++){
            number -= 5;
            System.out.println("number = " + number);
        }
    }

    public static void pow(){

        System.out.println();
        System.out.println("Задача 6");

        double square = 0;

        for (int i = 10; i <= 20; i++){
            square = Math.pow(i, 2);
            System.out.println("Квадрат числа " + i + " равен " + square);
        }
    }
}
