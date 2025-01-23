package EulerPrograms.Project1;

import java.util.*;
public class multiples3And
{
    public static void main(String[] args) {
        
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("This program will list the natural numbers below a specified value (NON INCLUSIVE) that are multiples of 3 and 5 and then get their sum.\nPlease input soft max: ");
            int max = myObj.nextInt();
            myObj.nextLine();
            
            
            int numFactor3 = (max-1)/3;
            int numFactor5 = (max-1)/5;
            int numFactor15 = (max-1)/15;
            int sum3 = (int)(3*(numFactor3+1)*(numFactor3)/2.0);
            int sum5 = (int)(5*(numFactor5+1)*(numFactor5)/2.0);
            int sum15 = (int)(15*(numFactor15+1)*(numFactor15)/2.0);
            int totalSum = (sum3 + sum5) - sum15;
            
            System.out.println("\nTotal Sum: " + totalSum);
        }
        
    }
}
