package Homework.homework16;

import java.util.List;

public class ArrayList {

    List<Integer> value;

    public List<Integer> getValue() {
        return value;
    }

    public void setValue(Integer value) {
        if (this.value == null) {
            this.value = new java.util.ArrayList<>(value);
        } else {
            this.value.add(value);
        }
    }
}
