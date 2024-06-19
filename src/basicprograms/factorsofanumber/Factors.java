package basicprograms.factorsofanumber;

import java.util.Scanner;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listOfFactors = new ArrayList<>();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                listOfFactors.add(i);
            }
        }
        System.out.println(listOfFactors);
        sc.close();
    }
}

//Time Complexity - O(n)