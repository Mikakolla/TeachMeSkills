package Homework.homework10;

public class LengthException extends Exception{

    public UserInput userInput;

    public LengthException(UserInput userInput) {
        this.userInput = userInput;
    }

    @Override
    public String getMessage() {
        return "Ошибка: превышение лимита длинны поля. Воспользуйтесь методом get, чтобы удалить элемент";
    }
}
