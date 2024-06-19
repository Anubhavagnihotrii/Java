package basicprograms.factorsofanumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptimizeFactorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listOfFactors = new ArrayList<>();
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for (int i = 1; i <= Math.sqrt(n); i++) { // i*i<=n can also be used instead of i<=Math.sqrt(n)
            if (n % i == 0) {
                listOfFactors.add(i);
                if (n / i != i) {
                    listOfFactors.add(n / i);
                }
            }
        }
        System.out.println(listOfFactors); // unsorted
        Collections.sort(listOfFactors);
        System.out.println(listOfFactors); // sorted
        sc.close();
    }
}