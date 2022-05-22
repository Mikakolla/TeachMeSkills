package Homework.Homework9;

public enum Position {

    DIRECTOR(0.8),
    WORKER(1);

    private double coefficient;

    Position(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

}
