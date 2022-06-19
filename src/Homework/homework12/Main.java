package Homework.homework12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Sergey", User.Sex.MAN, 24);
        User user2 = new User("Ira", User.Sex.WOMAN, 18);
        User user3 = new User("Nikita", User.Sex.MAN, 32);

        List<User> listUsers = new ArrayList<>();

        listUsers.add(user1);
        listUsers.add(user2);
        listUsers.add(user2);
        listUsers.add(user3);

        Set<User> setUsers = new HashSet<>();

        setUsers.add(user1);
        setUsers.add(user2);
        setUsers.add(user3);

        UserService userService = new UserService();

        Collection<User> foundUsersByName = userService.searchUsersByName(listUsers);

        Collection<User> foundUsersBySex = userService.searchUsersBySex(listUsers);

        Collection<User> sortedUsersByAge = userService.sortedByAge(setUsers);

        HashMap<Integer, Integer> maxCount = taskWithMass();
    }

    public static HashMap<Integer, Integer> taskWithMass() {

        int[] mass = new int[]{1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : mass) {
            int count = 0;

            for (int j : mass) {
                if (i == j)
                    count++;
            }
            map.put(i, count);
        }

        System.out.println("map = " + map);

        HashMap<Integer, Integer> result = new HashMap<>();

        result.put(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey(), Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue());

        return result;
    }
}
