package Homework.Homework9;

import java.util.Set;

public class Director extends Employee {

    public Set<Employee> subordinate;

    @Override
    public double getWage() {

        double wage = 1000 * this.position.getCoefficient() * this.workExperience * (this.subordinate != null ? this.subordinate.size() : 1);

        return wage;
    }

    public Director(String name, String surname, Integer workExperience, Position position) {
        super(name, surname, workExperience, position);
    }

    @Override
    public String toString() {

        double wage = this.getWage();

        return "Директор: " +
                "Имя и Фамилмия - " + name + " " + surname +
                ", стаж работы - " + workExperience +
                ", должность - " + position +
                ", заработная плата - " + wage;
    }

    public void getInfAboutDirectorAndSubordinates() {

        System.out.println(this);

        System.out.println("Подчиненные директора:");

        for (Employee subordinate : this.subordinate) {
            System.out.println(subordinate);
        }

    }

    public Set<Employee> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Set<Employee> subordinate) {
        this.subordinate = subordinate;
    }
}
