package Project47;

import java.util.HashSet;
import java.util.Set;
//Import utilities
//Note that we use HashSets and Sets here because they automatically remove duplicates

public class ConsecutivePrimeFactors {

    public static void main(String[] args) {

        int consecutiveCount = 4; // Number of consecutive integers with distinct prime factors required
        int startingNumber = 1;   // Start checking from this number

        int firstNumber = findFirstConsecutiveIntegers(consecutiveCount, startingNumber);
        System.out.println("The first of " + consecutiveCount + " consecutive integers with " +
                           consecutiveCount + " distinct prime factors each is: " + firstNumber);

    }//end main

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

}//end class