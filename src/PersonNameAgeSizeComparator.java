import java.util.Comparator;

public class PersonNameAgeSizeComparator implements Comparator<Person> {
    int wordSurname = 0;

    public PersonNameAgeSizeComparator() {
    }

    public PersonNameAgeSizeComparator(int countWordSurname) {
        this.wordSurname = countWordSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        // если в фамилии не меньше слов чем в параметре компаратора сравниваем по возрасту
        if (wordSurname != 0 && o1.getWordCountSurname() >= wordSurname && o2.getWordCountSurname() >= wordSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else //  если выше условие ложь, проверка у кого длиннее фамилия
            if (o1.getWordCountSurname() > o2.getWordCountSurname()) {
                return 1;
            } else if (o1.getWordCountSurname() < o2.getWordCountSurname()) {
                return -1;
            } else // если выше ложь - возвращаем сравнение по возрасту
                return Integer.compare(o1.getAge(), o2.getAge());
    }
}

