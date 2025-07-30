package StringBuffer;
import java.util.*;

public class CopyChar {
	public  static StringBuilder Copyfirst(String s) {
		int l=s.length();
		StringBuilder sb=new StringBuilder();
		String copy=s.substring(0,2);
		for(int i=1;i<=l;i++) {
			sb.append(copy);
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		System.out.println(Copyfirst(s));

}

}
