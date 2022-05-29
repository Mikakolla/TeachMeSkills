package Homework.homework10;

public class LengthException extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ошибка: превышение лимита длины поля. Воспользуйтесь методом get, чтобы удалить элемент";
    }
}
