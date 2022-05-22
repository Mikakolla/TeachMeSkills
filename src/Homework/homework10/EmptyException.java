package Homework.homework10;

public class EmptyException extends Exception{

    public UserInput userInput;

    public EmptyException(UserInput userInput) {
        this.userInput = userInput;
    }

        @Override
    public String getMessage() {
        return "Ошибка: память пуста";
    }
}
