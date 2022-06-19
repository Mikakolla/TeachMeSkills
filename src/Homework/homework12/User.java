package Homework.homework12;

import java.util.Objects;

public class User implements Comparable<User> {

    public String name;
    public Sex sex;
    public Integer age;


    enum Sex {
        MAN,
        WOMAN
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age) {
            return 1;
        }
        else if (this.age < o.age) {
            return -1;
        }
        else {
            return this.name.compareTo(o.name);
        }
    }

    public User(String name, Sex sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && sex == user.sex && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
