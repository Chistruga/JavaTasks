package JavaExercisesTask;

import java.util.Scanner;

public class CheckPalindrome {
    private String givenString;

    public void checkIfAStringIsPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a Palindrome or not: ");
        givenString = sc.nextLine();

        if (givenString.equals(new StringBuilder(givenString).reverse().toString())) {
            System.out.println("Entered string is a Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}