package storingobjectinlist;

public class Student {
    String firstName;
    String lastName;
    int age;
    String branch;

    public Student(String firstName, String lastName, int age, String branch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.branch = branch;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                '}';
    }
}
