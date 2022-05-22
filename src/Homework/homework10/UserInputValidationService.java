package Homework.homework10;

import java.util.ArrayList;
import java.util.List;

public class UserInputValidationService {

    public static void validate(String input, UserInput userInput) {

        List<String> allInput;

        if (userInput.getInput() != null){
            allInput = userInput.getInput();
        } else {
            allInput = new ArrayList<>();
        }

        if (input.equals("exit")) {
            System.exit(0);
        } else if (input.equals("get")) {
            if (allInput.isEmpty()){

                try {
                    throw new EmptyException(userInput);
                } catch (EmptyException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println(allInput.get(0));
                allInput.remove(0);
            }
        } else if (allInput.size() == 4) {
            try {
                throw new LengthException(userInput);
            } catch (LengthException e) {
                e.printStackTrace();
            }
        } else {
            allInput.add(input);
            userInput.setInput(allInput);
            System.out.println("Запись добавлена");
        }
    }
}
