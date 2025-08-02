package Exception;
import java.util.*;
class InvalidCountryException extends Exception{
	InvalidCountryException(String s) {
		super(s);
	}
}

public class UserRegistration {
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		if(!userCountry.equalsIgnoreCase("India")) 
			throw new InvalidCountryException("User Outside India cannot be registered");
		
		else 
			System.out.println("User Registration done Successfully");
		
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		String userCountry=sc.nextLine();
		UserRegistration ur=new UserRegistration();
		
		try {
			ur.registerUser(username,userCountry);
		    
		}
		catch(InvalidCountryException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
