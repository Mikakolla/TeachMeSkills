package Homework.homework18.withLock;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Car {

    private List<String> brand;
    private Lock lock = new ReentrantLock();

    public synchronized List<String> searchBrand(String brandForSearch) throws InterruptedException {

        lock.lock();

        if ((brand.stream().filter(el -> el.contains(brandForSearch)).count() == 0)) {
            System.out.println("Указанная марка не найдена");
        } else {
            System.out.println("Указанная марка найдена");
        }

        lock.unlock();

        return brand.stream().filter(el -> el.contains(brandForSearch)).collect(Collectors.toList());

    }

    public synchronized void updateCarBrand(String brandForUpdate) throws InterruptedException {

        lock.lock();

        if ((brand.stream().filter(el -> el.contains(brandForUpdate)).collect(Collectors.toList())).isEmpty()) {
            this.brand.add(brandForUpdate);
            System.out.println("Марка добавлена");
        }
        else {
            this.brand.remove(brandForUpdate);
            System.out.println("Марка удалена");
        }

        lock.unlock();

    }

    public List<String> getBrand() {
        return brand;
    }

    public void setBrand(List<String> brand) {
        this.brand = brand;
    }
}
