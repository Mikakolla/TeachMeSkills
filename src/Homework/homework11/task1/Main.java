package Homework.homework11.task1;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User("Сергей", 24, Sex.MAN);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Курсы\\task1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(user);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:\\Курсы\\task1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        User userFromFile = (User) objectInputStream.readObject();

        System.out.println(userFromFile);


    }
}
