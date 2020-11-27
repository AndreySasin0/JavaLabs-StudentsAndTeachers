package StudentsAndTeachers;

import java.util.*;

import StudentsAndTeachers.*;

public class ListOfStudentsAndTeachers {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", "Воробьев", 4.6);
        Student st2 = new Student("Ярослав", "Бочков", 3.8);
        Student st3 = new Student("Валентин", "Рофлов", 4.1);
        Student st4 = new Student("Валерий", "Жмышенко", 5, "Преподаватель");
        Student st5 = new Student("Денис", "Петров", 2.7);
        Teacher tch1 = new Teacher("Альберт", "Жмышенко");
        Teacher tch2 = new Teacher("Николай", "Воронин");

        ArrayList<Human> people = new ArrayList<>();
        people.add(st1);
        people.add(st2);
        people.add(st3);
        people.add(st4);
        people.add(st5);
        people.add(tch1);
        people.add(tch2);

        ArrayList<Student> students = new ArrayList<>();
        for (Human person : people) {
            if (person instanceof Student && person.getStatus().contains("Студент")) {
                students.add((Student) person);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип сортировки: 1 - сортировка всех по имени, 2 - сортировка студентов по среднему баллу, 3 - сортировка студентов по имени");
        int destiny = scanner.nextInt();
        if (destiny == 1) {
            Collections.sort(people, new SortedByName());
            for (Human person : people) {
                person.prtFullInfo();
            }
        } else if (destiny == 2) {
            Collections.sort(students, new SortedByAvgMark().reversed()); //убрать .reversed для сортировки по возрастанию
            for (Student student : students) {
                student.prtFullInfo();
            }
        } else if (destiny == 3) {
            Collections.sort(students, new SortedByName());
            for (Student student : students) {
                student.prtFullInfo();
            }
        } else {
            System.out.println("Вывод всех людей без сортировки:");
            for (Human person : people) {
                person.prtFullInfo();
            }
        }

    }

}
