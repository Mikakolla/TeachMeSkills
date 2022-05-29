package Homework.homework10;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        UserInput userInput = new UserInput();
        UserInputValidationService userInputValidationService = new UserInputValidationService();

        System.out.println("Введите текст");
        String input = console.nextLine();

        while (!Objects.equals(input, "exit")) {
            userInputValidationService.validate(userInput, input);

            System.out.println("Введите текст");
            input = console.next();
        }
    }
}
