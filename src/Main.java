import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Iv Iv iv", 42));
        person.add(new Person("Senya", "Lom", 50));
        person.add(new Person("Grisha", "Git Kitgfgfgffgfgfgfgfgfffgfg Mit", 15));
        person.add(new Person("Sasha", "Luk", 17));
        person.add(new Person("Pasha", "Git Kit Mit Fit", 99));


        person.removeIf(person1 -> {return person1.getAge() < 18;});

        System.out.println(person);
    }
}
