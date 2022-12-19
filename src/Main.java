import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Iv", 42));
        person.add(new Person("Vova", "Pit", 23));
        person.add(new Person("Senya", "Lom", 50));
        person.add(new Person("Grisha", "Git", 15));
        person.add(new Person("Sasha", "Luk", 17));
        person.add(new Person("Tolya", "Rub", 42));
        person.add(new Person("Bolik", "Bol", 35));

        System.out.println(person);
    }
}