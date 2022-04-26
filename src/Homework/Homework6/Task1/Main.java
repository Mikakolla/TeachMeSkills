package Homework.Homework6.Task1;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3);
        Rectangle rectangle = new Rectangle(3, 3);
        Rectangle rectangle2 = new Rectangle(6, 8);
        Circle circle = new Circle(15);
        Circle circle2 = new Circle(7);

        FigureInt[] arr = new FigureInt[]{triangle, rectangle, circle, rectangle2, circle2};

        sumPerimeter(arr);

    }

    public static void sumPerimeter(FigureInt[] arr) {

        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i].calculationPerimeter();
        }

        System.out.println("Сумма периметра всех фигур = " + sum);
    }

}
