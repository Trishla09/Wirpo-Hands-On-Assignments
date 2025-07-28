package Arrayss;
import java.util.*;

public class PresentOrNot {
	public static int presentOrNot(int arr[],int search) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) 
				index=i;
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,4,34,56,7};
		int search=sc.nextInt();
		System.out.println(presentOrNot(arr,search));
	}

}
