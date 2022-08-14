import java.util.Comparator;

public class PersonNameAgeSizeComparator implements Comparator<Person> {
    int wordSurname;

    public PersonNameAgeSizeComparator() {
    }

    public PersonNameAgeSizeComparator(int countWordSurname) {
        this.wordSurname = countWordSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        // если в фамилии не меньше слов чем в параметре компаратора сравниваем по возрасту
        if (o1.getWordCountSurname() >= wordSurname && o2.getWordCountSurname() >= wordSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else //  проверка на длину фамилии
            if (o1.getSurname().length() > o2.getSurname().length()) {
                return 1;
            } else if (o1.getSurname().length() < o2.getSurname().length()) {
                return -1;
            } else // если и имя и фамилия одинаковой длины, сравниваем по возрасту
                return Integer.compare(o1.getAge(), o2.getAge());
    }
}

