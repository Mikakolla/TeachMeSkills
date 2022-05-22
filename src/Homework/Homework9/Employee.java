package Homework.Homework9;

public abstract class Employee {

    public String name;
    public String surname;
    public Integer workExperience;
    public Position position;

    public double getWage() {

        double wage = 1000 * this.position.getCoefficient() * this.workExperience;

        return wage;
    }

    public Employee(String name, String surname, Integer workExperience, Position position) {
        this.name = name;
        this.surname = surname;
        this.workExperience = workExperience;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
