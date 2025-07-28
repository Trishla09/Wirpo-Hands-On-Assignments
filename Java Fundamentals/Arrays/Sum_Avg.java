package Arrayss;

public class Sum_Avg {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0,avg=0;
		for(int i:arr)
			sum+=i;
		avg=sum/arr.length;
		System.out.println("Sum="+sum+" Avg="+avg);
		
	}

}
