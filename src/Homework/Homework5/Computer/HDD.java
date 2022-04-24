package Homework.Homework5.Computer;

public class HDD {

    private String name;

    private String volume;

    private TypeHDD type;

    public HDD(String name, String volume, TypeHDD type){

        this.name = name;
        this.volume = volume;
        this.type = type;

    }

    @Override
    public String toString() {
        return "HDD{" +
                "Производитель = '" + name + '\'' +
                ", Объем = '" + volume + '\'' +
                ", Тип = " + type +
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

    public TypeHDD getType() {
        return type;
    }

    public void setType(TypeHDD type) {
        this.type = type;
    }
}
