package OOPs.Encapsulation;
class Candidates{
    private String name;
    private int usn;
    private String branch;
    private  int sem;
    public void setName(String name) {
        this.name = name;
    }

    public void setUsn(int usn) {
        this.usn = usn;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public String getName() {
        return name;
    }

    public int getUsn() {
        return usn;
    }

    public String getBranch() {
        return branch;
    }

    public int getSem() {
        return sem;
    }
}
public class encap {
    public static void main(String[] args) {
        Candidates c = new Candidates();
        c.setName("Anubhav");
        System.out.println(c.getName());
        Candidates c1 = new Candidates();
        c1.setName("Aditya");
        System.out.println(c1.getName());
    }
}
//In OOPs.Encapsulation the data members and member functions are kept private.
// It can be accessed through Getters and Setters.