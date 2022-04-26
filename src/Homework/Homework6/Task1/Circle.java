package Homework.Homework6.Task1;

public class Circle extends Rectangle implements FigureInt {

    private Integer radius;

    public double calculationArea() {

        double area = 3.14 * Math.pow(this.radius, 2);

        return area;
    }

    public double calculationPerimeter() {

        double perimeter = 2 * 3.14 * this.radius;

        return perimeter;
    }

    public Circle(Integer radius) {
        super();
        this.radius = radius;
    }
}
