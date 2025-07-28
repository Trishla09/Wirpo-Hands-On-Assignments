package Arrayss;

public class Large_Small_2_Nums {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int firstLargest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		int firstSmallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			
			else if(arr[i]<firstLargest && arr[i]>secondLargest) 
				secondLargest=arr[i];}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<firstSmallest) {
				secondSmallest=firstSmallest;
				firstSmallest=arr[i];
			}
			
			else if(arr[i]>firstSmallest && arr[i]<secondSmallest) 
				secondSmallest=arr[i];
			}
		System.out.println("First Largest:"+firstLargest+" Second Largest:"+secondLargest);
		System.out.println("First Smallest:"+firstSmallest+" Second Smallest:"+secondSmallest);
	}

}
