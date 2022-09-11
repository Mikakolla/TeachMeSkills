package Homework.homework18.withLock;

public class CarSearchBrandThread extends Thread{

    private Car car;
    private String brandForSearch;
    private volatile boolean isRun = true;

    public CarSearchBrandThread(Car car, String brandForSearch) {
        this.car = car;
        this.brandForSearch = brandForSearch;
    }

    public void run() {

        System.out.println("run CarSearchBrandThread");

        while (isRun) {
            try {
                car.searchBrand(brandForSearch);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRun(boolean run) {
        isRun = run;
    }
}
