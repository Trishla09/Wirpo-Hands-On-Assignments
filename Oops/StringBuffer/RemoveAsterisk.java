package StringBuffer;

import java.util.Scanner;

public class RemoveAsterisk {
    
    public static StringBuffer processString(String input) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*' || 
                (i > 0 && input.charAt(i - 1) == '*') || 
                (i < input.length() - 1 && input.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(input.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with *: ");
        String str = sc.nextLine();

        StringBuffer output = processString(str);
        System.out.println("Output: " + output);
    }
}

