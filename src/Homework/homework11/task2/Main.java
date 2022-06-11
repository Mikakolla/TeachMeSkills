package Homework.homework11.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("D:\\Курсы\\task2.txt");
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

        FileWriter romeo = new FileWriter("D:\\Курсы\\Romeo.txt");
        FileWriter juliet = new FileWriter("D:\\Курсы\\Juliet.txt");

        FileWriter writeFile = null;

        String writeLine = lineNumberReader.readLine();

        while (writeLine != null) {

            if (writeLine.startsWith("romeo:")) {
                writeFile = romeo;
            } else if (writeLine.startsWith("juliet:")) {
                writeFile = juliet;
            }

            writeFile.write(writeLine);

            writeLine = lineNumberReader.readLine();

        }

        fileReader.close();
        romeo.close();
        juliet.close();

    }

}
