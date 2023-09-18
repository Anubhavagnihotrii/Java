package Inheritance.Single;

//Single Inheritance

class animal{
    void speak()
    {
        System.out.println("Animals have there own language");
    }
}
class horse extends  animal
{

}
public class inheritanceExample1 {
    public static void main(String[] args) {
    horse h = new horse();
    h.speak();
    }
}
