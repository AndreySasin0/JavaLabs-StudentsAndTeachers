package StudentsAndTeachers;

import java.util.Comparator;

public class SortedByAvgMark implements Comparator<Student> {
    public int compare(Student obj1, Student obj2)
    {
        double avgMark1= obj1.getAvgMark();
        double avgMark2= obj2.getAvgMark();

        if (avgMark1 > avgMark2) {
            return 1;
        } else if (avgMark1 < avgMark2) {
            return -1;
        } else {
            return 0;
        }
    }
}
