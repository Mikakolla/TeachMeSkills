package Homework.Homework5.Computer;

import static Homework.Homework5.Computer.TypeHDD.EXTERNAL;

public class main {

    public static void main(String[] args) {

        Computer computer1 = new Computer(1000, "ASUS");

        computer1.infComputer1();

        RAM ram = new RAM("Crucial", "32");
        HDD hdd = new HDD("WD", "1000MB", EXTERNAL);

        Computer computer2 = new Computer(500, "HP", ram, hdd);

        computer2.infComputer2();

    }
}
