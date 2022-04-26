package Homework.Homework6.Task2;

public class Worker implements Impl {

    private String position;

    @Override
    public void printPosition() {
        System.out.println("Должность : " + this.position);
    }

    public Worker(String position) {
        this.position = position;
    }
}
