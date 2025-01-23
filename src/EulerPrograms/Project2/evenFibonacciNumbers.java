package EulerPrograms.Project2;

import EulerPrograms.Library;

public class evenFibonacciNumbers {
    
    public static void main(String[] args) {

        int limit = 4000000;
        int sum = Library.calculateEvenFibonacciSum(limit);
        System.out.println("The sum of even Fibonacci numbers not exceeding " + limit + " is: " + sum);
        
    }

}
