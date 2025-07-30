package StringBuffer;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input))
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is Not a Palindrome");
    }
}
