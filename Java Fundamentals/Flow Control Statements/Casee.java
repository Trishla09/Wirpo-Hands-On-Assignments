package Flow_Control_Structure;
import java.util.*;

public class Casee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>=65 && ch<=90) {
			char mod=(char)(ch+32);
			System.out.println(ch+" -> "+mod);
		}
		else if(ch>=97 && ch<=122) {
			char mod=(char)(ch-32);
			System.out.println(ch+" -> "+mod);
		}
		
		

	}

}
