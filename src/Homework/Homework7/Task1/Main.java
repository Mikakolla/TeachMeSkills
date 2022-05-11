package Homework.Homework7.Task1;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(12345, "IPhone", 150);
        Phone phone2 = new Phone(321123, "Samsung", 150);
        Phone phone3 = new Phone(54321, "Nokia", 500);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();

        phone1.receiveCall("Сергей");
        phone1.receiveCall("Тимофей", 555);

        System.out.println();
        phone1.sendMessage(123, 456, 789);
    }

}
