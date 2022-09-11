package Homework.homework18.withLock;

public class CarUpdateBrand extends Thread{

    private Car car;
    private String brandForUpdate;
    private volatile boolean isRun = true;

    public CarUpdateBrand(Car car, String brandForUpdate) {
        this.car = car;
        this.brandForUpdate = brandForUpdate;
    }

    public void run() {

        System.out.println("run CarUpdateBrand");

        while (isRun) {
            try {
                car.updateCarBrand(brandForUpdate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRun(boolean run) {
        isRun = run;
    }

}
