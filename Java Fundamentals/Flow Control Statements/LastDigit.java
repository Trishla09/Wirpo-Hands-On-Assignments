package Flow_Control_Structure;
import java.util.*;

public class LastDigit {
	public static boolean lastDigit(int a ,int b) {
		if((a%10)==(b%10))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lastDigit(a,b));

	}

}
