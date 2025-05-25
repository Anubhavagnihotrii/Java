package JavaRecordExample;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("anubhav",21);
        System.out.println(p.age());
        System.out.println(p.name());
        System.out.println(p.greet());
    }
}
