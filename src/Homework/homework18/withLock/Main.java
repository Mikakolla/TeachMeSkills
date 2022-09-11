package Homework.homework18.withLock;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> brand = new ArrayList<>();
        brand.add("AUDI");
        brand.add("BMW");
        brand.add("VOLVO");

        Car car = new Car();
        car.setBrand(brand);

        CarUpdateBrand carUpdateBrand1 = new CarUpdateBrand(car, "VOLVO");
        CarUpdateBrand carUpdateBrand2 = new CarUpdateBrand(car, "VOLVO");
        CarUpdateBrand carUpdateBrand3 = new CarUpdateBrand(car, "VOLVO");

        carUpdateBrand1.start();
        carUpdateBrand2.start();
        carUpdateBrand3.start();


        CarSearchBrandThread carThread1 = new CarSearchBrandThread(car, "VOLVO");
        CarSearchBrandThread carThread2 = new CarSearchBrandThread(car, "VOLVO");
        CarSearchBrandThread carThread3 = new CarSearchBrandThread(car, "VOLVO");

        carThread1.start();
        carThread2.start();
        carThread3.start();

        Thread.sleep(7000);

        carUpdateBrand1.setRun(false);
        carUpdateBrand2.setRun(false);
        carUpdateBrand3.setRun(false);

        carThread1.setRun(false);
        carThread2.setRun(false);
        carThread3.setRun(false);

        System.out.println("Потоки остановлены");
    }
}
