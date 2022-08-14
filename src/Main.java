import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> set = new ArrayList<>();
        Person p1 = new Person("Irina", "Belkina Strelkina Vkosmosletayushaya", 20);
        Person p2 = new Person("Anatoliy", "Velichestvenniy", 18);
        Person p3 = new Person("Aleksey", "Evtushenko Tavricheskiy Perviy i Posledniy", 19);
        Person p4 = new Person("Aleksey", "Pryamohodyashiy", 29);
        Person p5 = new Person("Ifstafiy", "Vechno Molodoy Vechno Pyaniy ", 102);
        Person p6 = new Person("Nikolas", "Novogodniy", 20);
        Person p7 = new Person("Djoan", "Kisly Borsh ", 25);
        Person p8 = new Person("Donald", "Trump Corp Limited", 20);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);
        System.out.println("Содержание до сортировки:\n" + set);
        //сортируем массив созданным компаратором, с заданным принципом сравнения без параметра wordSurname
        Collections.sort(set, new PersonNameAgeSizeComparator());
        System.out.println("Содержание после сортировки:\n" + set);
        comparePersonPrintLn(p2, p4);//используем метод для вывода победителя на экран
        comparePersonPrintLn(p7, p8);
        comparePersonPrintLn(p1, p5);
        comparePersonPrintLn(p6, p3);
    }

    public static void comparePersonPrintLn(Person one, Person thue) {
        //в методе используем компаратор с передачей макс количества сло в фамилии
        Comparator<Person> comparator = new PersonNameAgeSizeComparator(2);
        if (comparator.compare(one, thue) > 0) {
            System.out.println("Знатнее: " + one);
        } else if (comparator.compare(one, thue) < 0) {
            System.out.println("Знатнее: " + thue);
        }
    }
}