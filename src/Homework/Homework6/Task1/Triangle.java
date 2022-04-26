package Homework.Homework6.Task1;

public class Triangle extends Figure implements FigureInt {

    private Integer side;

    public Triangle() {

    }

    public double calculationArea() {

        double area = Math.pow(this.side, 2) * Math.sqrt(3) / 4;

        return area;
    }

    public double calculationPerimeter(){

        double perimeter = 3 * this.side;

        return perimeter;
    }

    public Triangle(Integer side) {
        this.side = side;
    }

}
