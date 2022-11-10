import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> longestSurname = new ArrayList<>();
        longestSurname.add(new Person("Евгений", "Васильев Питерский Смирнов", 50));
        longestSurname.add(new Person("Сергей", "Васильев Ленинградский Иванов", 45));
        longestSurname.add(new Person("Антон", "Васильев Московский", 40));
        longestSurname.add(new Person("Василий", "Васильев ", 35));

        Collections.sort(longestSurname, new PersonLongestSurnameComparator());
        System.out.println(longestSurname);
    }
}