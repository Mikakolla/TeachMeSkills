package Homework.homework16;

import java.util.List;

public class Family {

    String lastName;
    String address;
    Integer averageWage;
    List<Child> childrens;

    @Override
    public String toString() {
        return "Family{" +
                "lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", averageWage=" + averageWage +
                ", childrens=" + childrens +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAverageWage() {
        return averageWage;
    }

    public void setAverageWage(Integer averageWage) {
        this.averageWage = averageWage;
    }

    public List<Child> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Child> childrens) {
        this.childrens = childrens;
    }

    public Family(String lastName, String address, Integer averageWage, List<Child> childrens) {
        this.lastName = lastName;
        this.address = address;
        this.averageWage = averageWage;
        this.childrens = childrens;
    }
}
