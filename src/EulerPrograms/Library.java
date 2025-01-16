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

}
