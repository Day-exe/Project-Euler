package EulerPrograms.Project3;

import EulerPrograms.Library;

public class largestPrimeFactor {

    public static void main(String[] args) {

        long number = 600851475143L;
        long largestFactor = Library.findLargestPrimeFactor(number);
        System.out.println("The largest prime factor of " + number + " is: " + largestFactor);
        
    }

}
