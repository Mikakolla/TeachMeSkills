package Homework.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        UserInput userInput = new UserInput();
        UserInputValidationService userInputValidationService = new UserInputValidationService();

        String input;

        while (true) {

            System.out.println("Введите текст");
            input = console.nextLine();

            userInputValidationService.validate(input, userInput);
        }
    }
}
