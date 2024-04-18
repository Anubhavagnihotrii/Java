package basicprograms.staircase;

import java.util.Scanner;
    public class StairCase {
        public static void main(String[] args) {
            System.out.println("Enter the value of n");
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i+j>=n-1){
                        System.out.print("#");}
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            sc.close();
        }
    }
//Enter the value of n
//5
//    #
//   ##
//  ###
// ####
//#####
//
//This Pattern as output will be Printed.