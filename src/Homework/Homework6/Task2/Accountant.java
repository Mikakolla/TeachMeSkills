package Homework.Homework6.Task2;

public class Accountant implements Impl{

    private String position;

    @Override
    public void printPosition() {
        System.out.println("Должность : " + this.position);
    }

    public Accountant(String position) {
        this.position = position;
    }
}
