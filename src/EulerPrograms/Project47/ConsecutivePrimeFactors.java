package EulerPrograms.Project47;

import EulerPrograms.Library;
//Import utilities from library
//Note that we use HashSets and Sets here because they automatically remove duplicates

public class ConsecutivePrimeFactors {

    public static void main(String[] args) {

        int consecutiveCount = 4; // Number of consecutive integers with distinct prime factors required
        int startingNumber = 1;   // Start checking from this number

        int firstNumber = Library.findFirstConsecutiveIntegers(consecutiveCount, startingNumber);
        System.out.println("The first of " + consecutiveCount + " consecutive integers with " +
                           consecutiveCount + " distinct prime factors each is: " + firstNumber);

    }//end main

}//end class