package Lessons.Lessons8.imp;

import Lessons.Lessons8.Printable;

public class Magazine implements Printable {

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название журнала: " + this.name);
    }
}
