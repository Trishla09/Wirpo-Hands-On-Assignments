package StringBuffer;
import java.util.*;

public class EvenLength {
	public static String EvenOrOdd(String s) {
		int l=s.length();
		if(l%2==0) {
			String ss=s.substring(0,l/2);
			return ss;
		}
		else
			return null;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		System.out.println(EvenOrOdd(s));
		
	}


}
