package BasicPrograms.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked for a ArmStrong");
        int number = sc.nextInt();
        int x= number;
        int armstrongNumber=0;
        while(number>0)
        {
            int temp= number%10;
//            armstrongNumber += (int) Math.pow(temp,3);
            armstrongNumber +=temp*temp*temp;
            number /= 10;
        }
        if(x==armstrongNumber)
        {
            System.out.println("Number is Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}
