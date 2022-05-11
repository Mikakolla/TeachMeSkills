package Lessons.Lessons8.professions;

import Lessons.Lessons8.common.Person;

public class Driver extends Person {

    private int drivingExperience;

    public Driver(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                '}';
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
