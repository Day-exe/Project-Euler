package EulerPrograms.Project4;

import EulerPrograms.Library;

public class largestPalindromeProduct {

    public static void main(String[] args) {

        int largestPalindrome = Library.findLargestPalindromeProduct(3);
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestPalindrome);
    
    }

}
