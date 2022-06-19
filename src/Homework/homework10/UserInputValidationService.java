package Homework.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserInputValidationService {

    public void validate(UserInput userInput, String input){

        if (Objects.equals(input, "get")){
            System.out.println(userInput.getAndRemoveElInput());
        } else {
            try {
                userInput.addElement(input);
            } catch (LengthException e) {
                e.printStackTrace();
            }

        }

    }
}
