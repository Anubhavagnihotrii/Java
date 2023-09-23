package OOPs.Polymorphism.MethodOverloading;
class  add {
int addNumbers(int a , int b)
{
    return a+b;
}
double addNumbers(double a, double b )
{
   return a+b;
}
}
public class Calculator {
    public static void main(String[] args) {
    add  a= new add();
    int result1 = a.addNumbers(5,5);
    double result2 = a.addNumbers(5.5,5.5);
    System.out.println("result1 is "+result1);
    System.out.println("result2 is "+result2);
    }
}


//Compile-time (Static) OOPs.Polymorphism:
//
//        Also known as method overloading.
//        Occurs when two or more methods in the same class have the same name but different parameters (number, type, or order).
//        The compiler determines which method to call based on the method signature at compile time.