package Flow_Control_Structure;
import java.util.*;

public class PosNegZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n==0) 
			System.out.println("Zero");
		else if(n<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
			
		
		
	}

}
