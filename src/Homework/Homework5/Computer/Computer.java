package Homework.Homework5.Computer;

public class Computer {

    private Integer price;

    private String model;

    private RAM RAM;

    private HDD HDD;

    public Computer(Integer price, String model) {

        this.price = price;
        this.model = model;

    }

    public void infComputer1(){

        System.out.printf("Информация о компьютере: \nЦена: %s \nМодель: %s \n", this.price, this.model);
    }

    public Computer(Integer price, String model, RAM RAM, HDD HDD) {

        this.price = price;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;

    }

    public void infComputer2(){

        System.out.printf("Информация о компьютере: \nЦена: %s \nМодель: %s \nRAM: %s \nHDD: %s \n", this.price, this.model, this.RAM, this.HDD);
    }

    public Integer getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public Homework.Homework5.Computer.RAM getRAM() {
        return RAM;
    }

    public Homework.Homework5.Computer.HDD getHDD() {
        return HDD;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRAM(Homework.Homework5.Computer.RAM RAM) {
        this.RAM = RAM;
    }

    public void setHDD(Homework.Homework5.Computer.HDD HDD) {
        this.HDD = HDD;
    }
}
