package Exception;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name[]=new String[2];
		int mark[]=new int[6];
		int sum=0;
		int avg=0;
		try {
			System.out.println("Enter the name of 2 students");
			for(int i=0;i<2;i++) 
				name[i]=sc.next();
			System.out.println("Enter the marks of 2 students for 3 subjects");
		    for(int i=0;i<6;i++) {
		    	mark[i]=sc.nextInt();
		    	sum+=mark[i];
		    }
		    avg=sum/6;
		    System.out.println("The avg marks of two students is "+avg);
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
