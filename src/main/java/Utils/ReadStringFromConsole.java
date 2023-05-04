package Utils;

import java.util.Scanner;

public class ReadStringFromConsole {
    private String givenString;

    public String readStringFromConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a Palindrome or not: ");
        givenString = sc.nextLine();
        return givenString;
    }
}