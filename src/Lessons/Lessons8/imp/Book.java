package Lessons.Lessons8.imp;

import Lessons.Lessons8.Printable;

public class Book implements Printable {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название книги: " + this.name);
    }
}
