package StringBuffer;
import java.util.*;

public class WithoutFirstLast {
	public  static String WithoutFLC(String str) {
		StringBuilder sb=new StringBuilder(str);
		sb=sb.deleteCharAt(0);
		sb=sb.deleteCharAt(str.length()-2);
		return sb.toString();
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println(WithoutFLC(str));
	}

}



