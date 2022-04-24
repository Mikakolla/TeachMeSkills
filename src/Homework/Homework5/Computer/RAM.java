package Homework.Homework5.Computer;

public class RAM {

    private String name;

    private String volume;

    public RAM(String name, String volume){

        this.name = name;
        this.volume = volume;

    }


    @Override
    public String toString() {
        return "RAM{" +
                "Производитель = '" + name + '\'' +
                ", Объем = '" + volume + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
