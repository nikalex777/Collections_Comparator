import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Person implements Comparable<Person> {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() + "\n " + "Фамилия: " + getSurname() + "\n " + "Возрост: " + getAge() + "\n";
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) {
            return -1;
        } if (age > o.age) {
            return 1;
        } else {
            return 0;
        }
    }
}

