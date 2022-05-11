package Lessons.Lessons8.vehicles;

import Lessons.Lessons8.details.Engine;
import Lessons.Lessons8.professions.Driver;

public class Car {

    private String brand;

    private String classCar;

    private int weight;

    private Driver driver;

    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }

    public void sop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public Car(String brand, String aClassCar, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        classCar = aClassCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {

        return "Модель машины: " + brand + " Класс машины: " + classCar + " Вес: " + weight + " Водитель: " + driver + " Двигатель: " + engine;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
