package Homework.Homework9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Search {

    public void searchEmployee(Director director, String name) {

        List<String> names = getNamesSubordinates(director);

        if (names.contains(name)) {
            System.out.println("Подчиненный сотрудник с введеным именем найден");
        } else {
            System.out.println("Подчиненный сотрудник с введеным именем отсутствует");
        }

    }

    public List<String> getNamesSubordinates(Director director) {

        Set<Employee> employees = director.getSubordinate();

        List<String> name = new ArrayList<>();

        for (Employee employee : employees) {

            if (employee instanceof Worker) {
                name.add(employee.getName());
            } else {
                Director director1 = (Director) employee;
                name.add(employee.getName());
                name.addAll(getNamesSubordinates(director1));
            }
        }

        return name;
    }
}
