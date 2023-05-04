package JavaExercisesTask;

import java.util.Scanner;

public class CheckPalindrome {
    public String checkIfAStringIsPalindrome(String givenString) {
        if (givenString.equals(new StringBuilder(givenString).reverse().toString())) {
            return "Entered string is a Palindrome";
        } else {
            return "Given String is not a Palindrome";
        }
    }
}