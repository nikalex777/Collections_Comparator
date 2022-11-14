import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Person> longestSurname = new ArrayList<>();
        longestSurname.add(new Person("Евгений", "Васильев Питерский Смирнов", 15));
        longestSurname.add(new Person("Сергей", "Васильев Ленинградский Иванов", 17));
        longestSurname.add(new Person("Антон", "Васильев Московский", 40));
        longestSurname.add(new Person("Василий", "Васильев ", 35));

        longestSurname.removeIf(i -> (i.getAge() <= 18));
        System.out.println("Люди моложе 18 лет удалены из списка");

        for (Person tooYoung : longestSurname) {
            System.out.println(tooYoung.getName() + " " + tooYoung.getSurname() +
                    " - " + tooYoung.getAge());
        }
    }
}