import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Iv Iv iv", 42));
        person.add(new Person("Senya", "Lom", 50));
        person.add(new Person("Grisha", "Git Kit Mit", 15));
        person.add(new Person("Sasha", "Luk", 17));

        Collections.sort(person, new PersonComporator());

        System.out.println(person);
    }
}
