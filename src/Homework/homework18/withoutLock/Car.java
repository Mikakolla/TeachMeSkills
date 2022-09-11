package Homework.homework18.withoutLock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Car {

    private List<String> brand;

    public synchronized List<String> searchBrand(String brandForSearch) throws InterruptedException {

        System.out.println("searchBrand before sleep");
        Thread.sleep(1000);
        System.out.println("searchBrand after sleep");

        if ((brand.stream().filter(el -> el.contains(brandForSearch)).count() == 0)) {
            System.out.println("Указанная марка не найдена");
        } else {
            System.out.println("Указанная марка найдена");
        }

        return brand.stream().filter(el -> el.contains(brandForSearch)).collect(Collectors.toList());

    }

    public synchronized void updateCarBrand(String brandForUpdate) throws InterruptedException {

        System.out.println("updateCarBrand before sleep");
        Thread.sleep(1000);
        System.out.println("updateCarBrand after sleep");

        if ((brand.stream().filter(el -> el.contains(brandForUpdate)).collect(Collectors.toList())).isEmpty()) {
            this.brand.add(brandForUpdate);
            System.out.println("Марка добавлена");
        }
        else {
            this.brand.remove(brandForUpdate);
            System.out.println("Марка удалена");
        }

    }

    public List<String> getBrand() {
        return brand;
    }

    public void setBrand(List<String> brand) {
        this.brand = brand;
    }
}
