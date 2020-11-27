package StudentsAndTeachers;

public class Teacher extends Human {


    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        this.status = "Преподаватель";
    }

//    public String getStatus() {
//        return status;
//    }

    @Override
    public void prtFullInfo() {
        System.out.println("Имя: " + getLastName() + " " + getFirstName());
        System.out.println("Статус: " + getStatus());
        System.out.println();
    }

}
