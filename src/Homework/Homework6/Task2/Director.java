package Homework.Homework6.Task2;

public class Director implements Impl {

    private String position;

    @Override
    public void printPosition() {
        System.out.println("Должность : " + this.position);
    }

    public Director(String position) {
        this.position = position;
    }
}
