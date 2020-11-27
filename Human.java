package StudentsAndTeachers;

public class Human {
    private String firstName;
    private String lastName;
    protected String status;
    // private int age;

    public Human (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStatus() {
        return status;
    }

    public void prtFullName() {
        System.out.println (lastName + " " + firstName);
    }

    public void prtFullInfo() {
        System.out.println (getLastName() + " " + getFirstName());
    }


}
