package JavaExercisesTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {
    CheckPalindrome checkPalindrome = new CheckPalindrome();

    @Test
    void testAStringWhichIsPalindrome(){
        String palindromeString = "abbaabba";
        assertEquals("Entered string is a Palindrome", checkPalindrome.checkIfAStringIsPalindrome(palindromeString));
    }

    @Test
    void testAStringWhichIsNotAPalindrome(){
        String notAPalindromeString = "abcedefghijk";
        assertEquals("Given String is not a Palindrome", checkPalindrome.checkIfAStringIsPalindrome(notAPalindromeString));
    }
}