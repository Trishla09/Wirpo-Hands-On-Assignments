package Flow_Control_Structure;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		if(n<=1)
			flag=false;
		else {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		}
		if(flag==true)
			System.out.println("prime");
		else
			System.out.println("not prime");
			

	}

}
