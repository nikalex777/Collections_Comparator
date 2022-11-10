import java.util.Comparator;

public class PersonLongestSurnameComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getSurname().split(" ").length,
                o1.getSurname().split(" ").length);
    }
}



