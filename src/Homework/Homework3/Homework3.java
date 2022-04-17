package Homework.Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        int[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner console = new Scanner(System.in);

        System.out.println("Введите число");

        int number = console.nextInt();

        searchNumberInArr(arrInt, number); //Задача 0

        deleteElementArr(arrInt, number); //Задача 1 //Мне не нравится решение, но я не придумал как сделать иначе :с

        int[] arr = randomArr(); //Задача 2
        maxMinAverage(arr);

        int[] arr2 = randomArr(); //Задача 3
        int[] arr3 = randomArr();

        comparisonArr(arr2, arr3);
    }

    public static void searchNumberInArr(int[] arr, int number) {

        Arrays.sort(arr);

        if (Arrays.binarySearch(arr, number) >= 0)
            System.out.println("Число найдено в массиве");
        else
            System.out.println("Число не найдено в массиве");
    }

    public static void deleteElementArr(int[] arr, int number) {

        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {
                continue;
            }

            newArr[j] = arr[i];

            j++;
        }

        System.out.println("Массив без введенного числа: " + Arrays.toString(newArr));
    }

    public static int[] randomArr() {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите количество элементов массива");

        int n = console.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ((int) (Math.random() * 100));
        }

        System.out.println(Arrays.toString(arr));

        return arr;

    }

    public static void maxMinAverage(int[] arr) {

        int max = 0;
        int min = 0;
        int average = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            average += arr[i];
        }

        average = ((int) (average / arr.length));

        System.out.println("Максимальное значение элемента массива = " + max);
        System.out.println("Минимальное значение элемента массива = " + min);
        System.out.println("Среднее значение элементов массива = " + average);
    }

    public static void comparisonArr(int[] arr1, int[] arr2) {

        int averageArr1 = 0;
        int averageArr2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            averageArr1 += arr1[i];
        }

        averageArr1 = ((int) (averageArr1 / arr1.length));

        for (int i = 0; i < arr1.length; i++) {
            averageArr2 += arr2[i];
        }

        averageArr2 = ((int) (averageArr2 / arr2.length));

        if (averageArr1 > averageArr2) {
            System.out.println("Среднее значение первого массива больше, чем второго");
        } else if (averageArr1 < averageArr2){
            System.out.println("Среднее значение второго массива больше, чем первого");
        } else
            System.out.println("Среднее значение двуч массивов равно");
    }
}
