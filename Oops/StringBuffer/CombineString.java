package StringBuffer;

import java.util.Scanner;

public class CombineString {
    
    public static StringBuffer mergeStrings(String a, String b) {
        StringBuffer result = new StringBuffer();
        int minLen = Math.min(a.length(), b.length());

        for (int i = 0; i < minLen; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > b.length()) {
            result.append(a.substring(minLen));
        } else {
            result.append(b.substring(minLen));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        StringBuffer output = mergeStrings(str1, str2);
        System.out.println("Output: " + output);
    }
}
