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

    // Function to find the largest prime factor of a given number
    public static long findLargestPrimeFactor(long number) {

        long largestFactor = -1;

        // Divide out all factors of 2
        while (number % 2 == 0) {

            largestFactor = 2;
            number /= 2;

        }

        // Check odd factors
        for (long i = 3; i * i <= number; i += 2) {

            while (number % i == 0) {

                largestFactor = i;
                number /= i;

            }

        }

        // If number is still greater than 2, it's a prime factor
        if (number > 2) {

            largestFactor = number;

        }

        return largestFactor;

    }//end findLargestPrimeFactor

    // Function to find the largest palindrome product of two n-digit numbers
    public static int findLargestPalindromeProduct(int n) {

        int upperLimit = (int) Math.pow(10, n) - 1; // Largest n-digit number
        int lowerLimit = (int) Math.pow(10, n - 1); // Smallest n-digit number

        int maxPalindrome = 0;

        for (int i = upperLimit; i >= lowerLimit; i--) {

            for (int j = i; j >= lowerLimit; j--) { // Avoid duplicate pairs

                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome) {

                    maxPalindrome = product;

                }

            }

        }

        return maxPalindrome;

    }//end findLargestPalindromeProduct

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {

        String str = Integer.toString(number);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {

                return false;

            }
            left++;
            right--;

        }

        return true;

    }//end isPalindrome

    // Function to find the number of blue discs for the first arrangement exceeding a given total
    public static long findBlueDiscs(long minTotalDiscs) {
        long b = 15; // Initial number of blue discs
        long n = 21; // Initial total number of discs

        while (n <= minTotalDiscs) {
            long nextB = 3 * b + 2 * n - 2;
            long nextN = 4 * b + 3 * n - 3;

            b = nextB;
            n = nextN;
        }

        return b;
    }//end findBlueDiscs

}//end class
