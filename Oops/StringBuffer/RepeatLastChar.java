package StringBuffer;

import java.util.Scanner;

public class RepeatLastChar {
    
    public static StringBuffer repeatLastN(String str, int n) {
        StringBuffer result = new StringBuffer();

        String lastPart = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            result.append(lastPart);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n < 0 || n > input.length()) {
            System.out.println("Invalid n value.");
        } else {
            StringBuffer output = repeatLastN(input, n);
            System.out.println("Output: " + output);
        }
    }
}
