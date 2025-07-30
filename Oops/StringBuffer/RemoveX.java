package StringBuffer;

import java.util.Scanner;

public class RemoveX {

    public static String modifyString(String str) {
        if (str.length() == 0) return str;

        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = modifyString(input);
        System.out.println("Result: " + result);
    }
}
