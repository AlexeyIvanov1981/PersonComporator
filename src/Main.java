import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Iv Iv iv", 42));
        person.add(new Person("Senya", "Lom", 50));
        person.add(new Person("Grisha", "Git Kitgfgfgffgfgfgfgfgfffgfg Mit", 15));
        person.add(new Person("Sasha", "Luk", 17));
        person.add(new Person("Pasha", "Git Kit Mit Fit", 99));

        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int numberOfWordsInSurnameO1 = o1.getSurname().split(" ").length;
                int numberOfWordsInSurnameO2 = o2.getSurname().split(" ").length;

                if (numberOfWordsInSurnameO1 > numberOfWordsInSurnameO2) {
                    return -1;
                } else if (numberOfWordsInSurnameO1 < numberOfWordsInSurnameO2) {
                    return +1;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else if (o1.getAge() < o2.getAge()) {
                    return +1;
                }
                return 0;
            }
        });

        System.out.println(person);
    }
}
