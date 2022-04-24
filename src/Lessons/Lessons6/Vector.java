package Lessons.Lessons6;

public class Vector {

    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double vectorLength() {

        double vectorLength = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));

        System.out.println("Длина вектора = " + vectorLength);

        return vectorLength;

    }

    public void multiplication(int x1, int y1, int z1, int x2, int y2, int z2) {

        int multiplication = x1 * x2 + y1 * y2 + z1 * z2;

        System.out.println("Скалярное произведение = " + multiplication);
    }

    public void multiplicationVectors(int x1, int y1, int z1, int x2, int y2, int z2) {

        int multiplicationVectors = (y1 * z2 - z1 * y2 * z1 * x2 - x1 * z2 * x1 * y2 - y1 * x2);

        System.out.println("Векторное произведение = " + multiplicationVectors);
    }

    public void injection(double lengthVector1, double lengthVector2) {

        double injection = (lengthVector1 * lengthVector2) / (Math.abs(lengthVector1) * Math.abs(lengthVector2));

        System.out.println("Угол между векторами = " + injection);

    }

    public void sumVectors(int x2, int y2, int z2) {

        int sum = this.x + x2 * this.y + y2 * this.z + z2;

        System.out.println("Сумма векторов = " + sum);

    }

    public void difVectors(int x2, int y2, int z2) {

        int dif = this.x - x2 * this.y - y2 * this.z - z2;

        System.out.println("Разность векторов = " + dif);
    }
}
