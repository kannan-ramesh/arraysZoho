package arrayZoho;

import java.util.Scanner;

public class RearangeArray {

	public static void main(String[] args) {
//		Input : arr[] = {1, 2, 3, 4, 5, 6, 7}
//		Output : 4 5 3 6 2 7 1
//
//		Input : arr[] = {1, 2, 1, 4, 5, 6, 8, 8} 
//		Output : 4 5 2 6 1 8 1 8
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of Array n:");
		int n=input.nextInt();
		
		System.out.println("Enter array elements:");
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("the array is:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		rearangeOddEven(arr,n);
		

	}

	public static void rearangeOddEven(int[] arr, int n) {
		
		int array[]=new int[n];
		
		
		for(int i=0;i<n;i++) {
			array[i]=arr[i];
		}
		
		sort(arr);
		
		int left=0,right=n-1;
		
		for(int i=right;i>=0;i--) {
			if(i % 2 !=0) {
				arr[i]=array[right];
				right--;
			}else {
				arr[i]=array[left];
				left++;
			}
		}
		
		System.out.println("Rearange array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static int[] sort(int[] arr) {
			
		mergeSort(arr,0,arr.length-1);
		
		return arr;
			
	}

	public static void mergeSort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid= (start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
		
	}

	public static void  merge(int[] arr, int start,int mid,int end) {
		
		int[] merge = new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				merge[k++] = arr[i++];
			}else {
				merge[k++] = arr[j++];
			}
		}
		
		while(i<=mid) {
			merge[k++]=arr[i++];
		}
		while(j<=end) {
			merge[k++] = arr[j++];
		}
		
		for(k=0, i=start;k<merge.length;k++,i++)
        {
            arr[i]=merge[k];
        }
		
		
	}

	

}
