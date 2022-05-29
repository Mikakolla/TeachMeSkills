package Homework.homework10;

public class EmptyException extends RuntimeException{

        @Override
    public String getMessage() {
        return "Ошибка: память пуста";
    }
}
