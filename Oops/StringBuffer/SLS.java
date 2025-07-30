package StringBuffer;
import java.util.*;

public class SLS {
public static String ShortLongShort(String a,String b) {
		
		int al=a.length();
		int bl=b.length();
		if((al>=1 && bl>=1)&& al!=bl) {
			String sh=(al<bl)?a:b;
			String lo=(al>bl)?a:b;
			return sh+lo+sh;
			}
		else if(al==0 || bl==0)
			return (al==0)?b:a;
		else
			return null;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string1:");
		String a=sc.nextLine();
		System.out.println("Enter a string2:");
		String b=sc.nextLine();
		System.out.println(ShortLongShort(a,b));

	}

}
