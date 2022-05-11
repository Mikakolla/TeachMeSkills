package Homework.Homework7.Task1;

import java.util.Arrays;

public class Phone {

    Integer number;
    String model;
    Integer weight;

    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall (String name, Integer number){
        System.out.printf("Звонит %s, номер: %s", name, number);
    }

    public void sendMessage (Integer ... numbers){
        System.out.println("Сообщение отправлено на номера: " + Arrays.toString(numbers));
    }

    public Phone(Integer number, String model, Integer weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(Integer number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Телефон: " +
                "Номер = " + number +
                ", Модель = '" + model + '\'' +
                ", Вес = " + weight;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
