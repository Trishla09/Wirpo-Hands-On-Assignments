package Exception;

import java.util.Scanner;

class AgeInvalidException extends Exception{
	AgeInvalidException(String s) {
		super(s);
	}
}

public class AgeName {
	void validAge(int age) throws AgeInvalidException {
		if(!(age>=18 && age<60)) 
			throw new AgeInvalidException("Your age is not in range");
		
		else 
			System.out.println("Your age is in range");
		
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		AgeName an=new AgeName();
		try {
			an.validAge(age);
		    
		}
		catch(AgeInvalidException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
