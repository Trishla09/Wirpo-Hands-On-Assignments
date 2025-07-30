package StringBuffer;
import java.util.*;

public class ConcatenateString {
public static StringBuilder  Concattt(String s1,String s2) {
		
		String sl1=s1.toLowerCase();
		String sl2=s2.toLowerCase();
		StringBuilder sb1=new StringBuilder(sl1);
		StringBuilder sb2=new StringBuilder(sl2);
		if((sb1.charAt(sb1.length()-1))==(sb2.charAt(0))) {
			StringBuilder sf1=sb1.deleteCharAt(sb1.length()-1);
			return sf1.append(sb2) ;
		}else
			return sb1.append(" ").append(sb2);
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1=sc.nextLine();
		System.out.println("Enter second string:");
		String s2=sc.nextLine();
		StringBuilder ans=Concattt(s1,s2);
		System.out.println(ans);
		
		
	}
}
