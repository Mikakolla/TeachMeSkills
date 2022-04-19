package Homework.Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        soutArr();

    }

    public static void soutArr() {

//Задача 1
        int[][][] arr = new int[3][3][3];

        arr = addValueArr(arr);

        System.out.println(Arrays.deepToString(arr));

        System.out.println("Введите число");

        Scanner console = new Scanner(System.in);

        int number = console.nextInt();

        arr = addNumberToArr(arr, number);

        System.out.println(Arrays.deepToString(arr));

//Задача 2

        char[][] chessArr = new char[8][8];

        addValueChess(chessArr);
    }

    public static int[][][] addValueArr(int[][][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }
        return arr;
    }

    public static int[][][] addNumberToArr(int[][][] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = arr[i][j][k] + number;
                }
            }
        }
        return arr;
    }

    public static char[][] addValueChess(char[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if ((j%2 != 0 && i%2==0) || (j%2 == 0 && i%2!=0))
                    arr[i][j] = 'B';
                else
                    arr[i][j] = 'W';
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }
}
