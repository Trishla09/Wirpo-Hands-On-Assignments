package Flow_Control_Structure;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equalsIgnoreCase("Female")) {
			if(age>=1 && age<=58)
				System.out.println("Interest is 8.2%");
			else if(age>=59 && age<=100)
				System.out.println("Interest is 9.2%");
		}
		else {
			if(age>=1 && age<=58)
				System.out.println("Interest is 8.4%");
			else if(age>=59 && age<=100)
				System.out.println("Interest is 10.5%");
		}
			

	}

}
