package Lessons.Lessons6;

import java.util.Arrays;
import java.util.Scanner;

public class VectorController {

    public static void main(String[] args) {

        Vector vector1 = new Vector();

        vector1.setX(10);
        vector1.setY(10);
        vector1.setZ(10);

        double lengthVector1 = vector1.vectorLength();

        System.out.println();

        Vector vector2 = new Vector();

        vector2.setX(7);
        vector2.setY(3);
        vector2.setZ(5);

        vector2.multiplication(vector1.getX(), vector1.getY(), vector1.getZ(), vector2.getX(), vector2.getY(), vector2.getZ());

        double lengthVector2 = vector2.vectorLength();

        System.out.println();

        vector2.multiplicationVectors(vector1.getX(), vector1.getY(), vector1.getZ(), vector2.getX(), vector2.getY(), vector2.getZ());

        System.out.println();

        vector1.injection(lengthVector1, lengthVector2);

        System.out.println();

        vector1.sumVectors(vector2.getX(), vector2.getY(), vector2.getZ());

        System.out.println();

        vector1.difVectors(vector2.getX(), vector2.getY(), vector2.getZ());

        System.out.println();


        Scanner console = new Scanner(System.in);

        System.out.println("Введите количество векторов");

        int number = console.nextInt();

        statMeth(number);
    }

    public static void statMeth(int number){

        Vector[] arr = new Vector[number];

        for (int i = 0; i<number; i++){

            Vector vector = new Vector();

            vector.setX((int) (Math.random()*100));
            vector.setY((int) (Math.random()*100));
            vector.setZ((int) (Math.random()*100));

            arr[i] = vector;

//            System.out.println("Вектор " + i + " x = %s, y = %s, z = %s", arr[i].getX(), arr[i].getY(), arr[i].getZ());
        }

        System.out.println(Arrays.toString(arr));

    }
}
