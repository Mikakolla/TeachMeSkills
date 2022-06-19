package Homework.homework10;

import java.util.ArrayList;
import java.util.List;

public class UserInput {

    public List<String> input;

    public void setInput(String input) {
        this.input.add(input);
    }

    public void addElement(String consoleInput) {
        if (input.size() == 5) {
            throw new LengthException();
        } else {
            this.setInput(consoleInput);
        }
    }

    public String getAndRemoveElInput() {
        if (input.size() == 0) {
            throw new EmptyException();
        } else {
            return input.remove(0);
        }
    }
}
