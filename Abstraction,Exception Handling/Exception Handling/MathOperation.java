package Exception;
import java.util.*;

import java.util.Scanner;

public class MathOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int avg=0;
		try {
			System.out.println("Enter the array size:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the array elements:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			avg=sum/size;
			System.out.println("The sum of the array is "+sum);
			System.out.println("The avg of the array is "+avg);	
			
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
			System.out.println("Program completed");
		}

	}
}
