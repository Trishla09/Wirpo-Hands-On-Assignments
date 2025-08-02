package Exception;
import java.util.*;

public class ExcepionQ1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the array size:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the array elements:");
			for(int i=0;i<arr.length;i++) 
				arr[i]=sc.nextInt();
			System.out.println("Enter index to get the value:");
			int i=sc.nextInt();
			System.out.println("The value is "+arr[i]);	
			System.out.println("Completing try block");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside Finally block");
		}

	}

}
