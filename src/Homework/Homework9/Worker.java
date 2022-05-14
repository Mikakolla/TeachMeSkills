package Homework.Homework9;

public class Worker extends Employee {

    public Worker(String name, String surname, Integer workExperience, Position position) {
        super(name, surname, workExperience, position);
    }

    @Override
    public String toString() {

        double wage = this.getWage();

        return "Работник: " +
                "Имя и Фамилмия - " + name + " " + surname +
                ", стаж работы - " + workExperience +
                ", должность - " + position +
                ", заработная плата - " + wage;

    }
}
