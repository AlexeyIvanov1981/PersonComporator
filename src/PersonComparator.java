import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int numberOfWordsInSurnameO1 = o1.getSurname().split(" ").length;
        int numberOfWordsInSurnameO2 = o2.getSurname().split(" ").length;

        if (numberOfWordsInSurnameO1 > numberOfWordsInSurnameO2){
            return -1;
        } else if (numberOfWordsInSurnameO1 < numberOfWordsInSurnameO2){
            return +1;
        } else if (o1.getAge() > o2.getAge()){
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return +1;
        }
        return 0;
    }
}
