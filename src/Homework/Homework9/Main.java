package Homework.Homework9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        task1
        Worker worker1 = new Worker("Sergey", "Zhukov", 5, Position.WORKER);
        Worker worker2 = new Worker("Taylor", "Burks", 2, Position.WORKER);
        Worker worker3 = new Worker("Eloisa", "Lane", 3, Position.WORKER);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);

        Director director1 = new Director("Kirill", "Pyrh", 10, Position.DIRECTOR);

        System.out.println(director1);

        Set<Employee> subordinates1 = new HashSet<>();
        subordinates1.add(worker1);
        subordinates1.add(worker2);

//        task2
        director1.setSubordinate(subordinates1);

        System.out.println();
        director1.getInfAboutDirectorAndSubordinates();

//        task3
        Director director2 = new Director("Randall", "Dotson", 8, Position.DIRECTOR);
        Set<Employee> subordinates2 = new HashSet<>(Arrays.asList(worker3));
        director2.setSubordinate(subordinates2);

        subordinates1.add(director2);

        director1.setSubordinate(subordinates1);

//        task4
        System.out.println();
        director1.getInfAboutDirectorAndSubordinates();

//        task5
        System.out.println();
        Scanner console = new Scanner(System.in);

        System.out.println("Введите имя для поиска");
        String name = console.nextLine();

        Search search = new Search();

        search.searchEmployee(director1, name);
    }


}
