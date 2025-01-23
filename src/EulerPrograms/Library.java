package EulerPrograms;

import java.util.HashSet;
import java.util.Set;
//import utilities
//hashset and set are used because they automatically handle duplicates and are faster than lists

public class Library {
    
    // Function to find the first set of consecutive integers with specified number of distinct prime factors
    public static int findFirstConsecutiveIntegers(int consecutiveCount, int start) {

        int currentNumber = start;
        int count = 0;

        while (true) {

            if (hasDistinctPrimeFactors(currentNumber, consecutiveCount)) {

                count++;

                if (count == consecutiveCount) {

                    return currentNumber - consecutiveCount + 1;

                }//end if

            } else {

                count = 0;

            }//end if else

            currentNumber++;

        }//end while

    }//end findFirstConsecutiveIntegers

    // Function to check if a number has the specified number of distinct prime factors
    public static boolean hasDistinctPrimeFactors(int number, int distinctFactorCount) {

        Set<Integer> distinctFactors = getDistinctPrimeFactors(number);
        return distinctFactors.size() == distinctFactorCount;

    }//end hasDistinctPrimeFactors

    // Function to get all distinct prime factors of a number
    public static Set<Integer> getDistinctPrimeFactors(int number) {

        Set<Integer> primeFactors = new HashSet<>();
        for (int i = 2; i * i <= number; i++) {

            while (number % i == 0) {

                primeFactors.add(i);
                number /= i;

            }//end while loop

        }//end for loop

        if (number > 1) {

            primeFactors.add(number);

        }//end if

        return primeFactors;

    }//end getDistinctPrimeFactors

    // Function to calculate the sum of even Fibonacci numbers up to a given limit
    public static int calculateEvenFibonacciSum(int limit) {

        int a = 1; // First Fibonacci number
        int b = 2; // Second Fibonacci number
        int sum = 0;

        while (b <= limit) {

            if (b % 2 == 0) {

                sum += b;

            }

            int next = a + b; // Calculate the next Fibonacci number
            a = b;
            b = next;
        }

        return sum;

    }//end calculateEvenFibonacciSum

}//end class
