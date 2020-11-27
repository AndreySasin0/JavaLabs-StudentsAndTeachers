package StudentsAndTeachers;

import java.util.Comparator;

public class SortedByName implements Comparator<Human> {
    public int compare(Human obj1, Human obj2) {
        String lastName1 = obj1.getLastName();
        String lastName2 = obj2.getLastName();
        String firstName1 = obj1.getFirstName();
        String firstName2 = obj2.getFirstName();

        if (lastName1.equals(lastName2)) {
            return firstName1.compareTo(firstName2);
        }
        else return lastName1.compareTo(lastName2);

    }
}
