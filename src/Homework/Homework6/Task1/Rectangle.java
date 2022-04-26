package Homework.Homework6.Task1;

public class Rectangle extends Triangle implements FigureInt {

    public Integer side1;
    public Integer side2;

    public Rectangle() {

    }

    public double calculationArea() {

        double area = this.side1 * this.side2;

        return area;
    }

    public double calculationPerimeter(){

        double perimeter = 2 * (this.side1 + this.side2);

        return perimeter;
    }

    public Rectangle(Integer side1, Integer side2) {
        super();
        this.side1 = side1;
        this.side2 = side2;
    }
}
