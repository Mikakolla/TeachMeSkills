package Homework.homework12;

import java.util.*;

public class UserService {

    public Collection<User> searchUsersByName(Collection<User> users){

        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя для поиска: ");

        String nameForSearch = console.nextLine();
        List<User> foundUsers = new ArrayList<>();

        for (User user : users) {
            if (user.name.equals(nameForSearch)){
                foundUsers.add(user);
            }
        }

        console.close();

        return foundUsers;
    }

    public Collection<User> searchUsersBySex(Collection<User> users) {

        Scanner console = new Scanner(System.in);
        System.out.printf("1. Man %n2. Woman %nВведите цифру для поиска по полу:");

        Integer sexNumber = console.nextInt();
        User.Sex sexForSearch = null;
        List<User> foundUsers = new ArrayList<>();

        if (sexNumber == 1) {
            sexForSearch = User.Sex.MAN;
        } else {
            sexForSearch = User.Sex.WOMAN;
        }

        for (User user : users) {
            if (user.sex.equals(sexForSearch)){
                foundUsers.add(user);
            }
        }

        return foundUsers;
    }

    public Collection<User> sortedByAge(Collection<User> users) {

        List<User> sortedUsers = new ArrayList<>(users);

        Collections.sort(sortedUsers, User::compareTo);

        return sortedUsers;
    }
}
