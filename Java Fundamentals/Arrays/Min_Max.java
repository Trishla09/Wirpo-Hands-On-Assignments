package Arrayss;

public class Min_Max {

	public static void main(String[] args) {
		int arr[]= {6,9,4,8,2,1,10};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max:"+max+" Min:"+min);

	}

}
