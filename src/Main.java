import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Домашнее задание по теме «Лямбда-выражения и функциональные интерфейсы»
        // ДОМАШНЕЕ ЗАДАНИЕ 1.
        List<Person> set = new ArrayList<>();
        set.add(new Person("Irina", "Belkina Strelkina Vkosmosletayushaya", 21));
        set.add(new Person("Anatoliy", "Velichestvenniy", 19));
        set.add(new Person("Aleksey", "Evtushenko Tavricheskiy Perviy i Posledniy", 18));
        set.add(new Person("Aleksey", "Pryamohodyashiy", 29));
        set.add(new Person("Ifstafiy", "Vechno Molodoy Vechno Pyaniy ", 12));
        set.add(new Person("Nikolas", "Novogodniy", 20));
        set.add(new Person("Djoan", "Kisly Borsh Esli Mnogo Limona Dobavit", 15));
        set.add(new Person("Donald", "Trump Corp Limited", 25));
        System.out.println("Содержание до сортировки:\n" + set);
        //сортируем массив через лямбда выражение по условиям ДЗ
        set.sort((Person o1, Person o2) -> {
            if (o1.getWordCountSurname() > o2.getWordCountSurname() && o1.getWordCountSurname() != o2.getWordCountSurname()) {
                return 1;
            } else if (o1.getWordCountSurname() < o2.getWordCountSurname() && o1.getWordCountSurname() != o2.getWordCountSurname()) {
                return -1;
            } else
                return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println("Содержание после сортировки:\n" + set);
    }
}