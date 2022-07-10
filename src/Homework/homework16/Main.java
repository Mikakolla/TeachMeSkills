package Homework.homework16;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
//        main.operationsWithStream();
        main.family();

    }

    public void operationsWithStream () {

        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 100; i++) {
            arrayList.setValue((int) (Math.random() * 100));
        }

        List<Integer> listWithoutDuplicate = arrayList.getValue().stream().distinct().collect(Collectors.toList());

        List<Integer> listValueInRange = arrayList.getValue().stream().filter(el -> el <= 17 && el > 7 && (el % 2 == 0)).collect(Collectors.toList());

        List<Integer> listMultiplicationValue = arrayList.getValue().stream().map(el -> el * 2).collect(Collectors.toList());

        List<Integer> listSortedTop4 = arrayList.getValue().stream().sorted().limit(4).collect(Collectors.toList());

        long countElonList = arrayList.getValue().stream().count();

        OptionalDouble averageList = arrayList.getValue().stream().mapToDouble(el -> el).average();

    }

    public void family() {

        Family family1 = new Family("Жуков", "Кальварийская", 1000, Arrays.asList(new Child("Сергей", 5, Child.Sex.MAN), new Child("Аня", 10, Child.Sex.WOMAN)));
        Family family2 = new Family("Алексеев", "Советская", 600, Arrays.asList(new Child("Дима", 8, Child.Sex.MAN)));
        Family family3 = new Family("Рыбак", "Ленина", 1600, Arrays.asList(new Child("Валера", 15, Child.Sex.MAN), new Child("Лиза", 2, Child.Sex.WOMAN), new Child("Даниил", 18, Child.Sex.MAN)));

        List<Family> families = Arrays.asList(family1, family2, family3);

        Map<String, Integer> mapFamilies = new HashMap<>();
        families.forEach(el -> mapFamilies.put(el.getLastName(), el.getAverageWage()));

        long countChild = families.stream().map(Family::getChildrens)
                .flatMap(el -> el.stream()
                        .filter(child -> child.getSex().equals(Child.Sex.MAN)))
                .count();

        List<Child> woman = families.stream().map(family -> family.getChildrens())
                .flatMap(childrens -> childrens.stream()
                        .filter(child -> child.getSex().equals(Child.Sex.WOMAN)))
                .collect(Collectors.toList());

        families.forEach(family -> {
            System.out.println("В семье с фамилией " + family.getLastName() + " " + family.getChildrens().size() + " детей");
        });

        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя для поиска");

        String nameChild = console.next();

        families.forEach(family -> {
            if (family.getChildrens().stream().anyMatch(child -> child.getName().equals(nameChild))){
                System.out.println("У семьи " + family.getLastName() + " есть ребенок с именем " + nameChild);
            } else {
                System.out.println("У семьи " + family.getLastName() + " нет ребенка с именем " + nameChild);
            }
        });
    }
}
