package storingobjectinlist;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();

        System.out.println(studentList);

        Student s1 = new Student("Anubhav","Agnihotri",20,"ISE");
        Student s2 = new Student("Himanshu","Prasad",20,"ISE");
        studentList.add(s1);
        studentList.add(s2);
        System.out.println(studentList);

        System.out.println(s1.getFirstName());
        s1.setFirstName("Aditya");
        System.out.println(s1.getFirstName());

        System.out.println(studentList);
    }
}
