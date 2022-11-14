import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> longestSurname = new ArrayList<>();
        longestSurname.add(new Person("Евгений", "Васильев Питерский Смирнов", 50));
        longestSurname.add(new Person("Сергей", "Васильев Ленинградский Иванов", 45));
        longestSurname.add(new Person("Антон", "Васильев Московский", 40));
        longestSurname.add(new Person("Василий", "Васильев ", 35));


        Comparator<Person> Surname = (Person o1, Person o2) -> Integer.compare(o2.getSurname().split(" ").length,
                o1.getSurname().split(" ").length);


        Collections.sort(longestSurname, Surname);
        System.out.println(longestSurname);
    }
}