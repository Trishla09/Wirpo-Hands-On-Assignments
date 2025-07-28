package Arrayss;
import java.util.*;

public class SortedArray {
	public static int[] swipping(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {4,7,2,5,9};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swipping(arr,i,j);
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
