package Homework.homework15;

import java.util.Scanner;

public class Service {

    public void main() {

        String text = "Hello!";
        String numberForFactorial = "6";

        Scanner console = new Scanner(System.in);

        int inputNumber = console.nextInt();

        if (inputNumber == 1) {
            MyInterface mf = input -> System.out.println(new StringBuilder(input).reverse());
            mf.test(text);
        } else if (inputNumber == 2) {

            MyInterface mf = input -> {

                Integer number = Integer.valueOf(input);
                Integer result = 1;

                for (int i = 1; i <= number; i++) {
                    result = result * i;
                }

                System.out.println("Факториал числа " + number + " равен " + result);
            };
            mf.test(numberForFactorial);
        }
    }
}
