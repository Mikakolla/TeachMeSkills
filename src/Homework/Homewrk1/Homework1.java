package Homework.Homewrk1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        helloUser();

    }

    public static void helloUser(){

        System.out.println("Введите ваше имя:");

        Scanner console = new Scanner(System.in);

        String name = console.nextLine();

        System.out.println("Hello " + name);
    }
}
