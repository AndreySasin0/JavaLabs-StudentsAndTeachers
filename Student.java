package StudentsAndTeachers;

public class Student extends Human {
    private double avgMark;

    public Student(String firstName, String lastName, double avgMark) {
        super(firstName, lastName);
        this.avgMark = avgMark;
        this.status = "Студент";
    }

    public Student(String firstName, String lastName, double avgMark, String status) {
        super(firstName, lastName);
        this.avgMark = avgMark;
        this.status = "Студент-преподаватель";
    }

//    public String getStatus() {
//        return status;
//    }

    public double getAvgMark() {
        return avgMark;
    }

    @Override
    public void prtFullInfo() {
        System.out.println("Имя: " + getLastName() + " " + getFirstName());
        System.out.println("Статус: " + getStatus());
        System.out.println("Средний балл: " + getAvgMark());
        System.out.println();
    }

}
