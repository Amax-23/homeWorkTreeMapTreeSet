import java.util.Comparator;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int countWordSurname;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        countWordSurname = surname.split(" +").length;
    }

    public int getWordCountSurname() {
        return countWordSurname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " возраст " + age;
    }
}
