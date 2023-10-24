package arrayZoho;

import java.util.Arrays;
import java.util.Scanner;

public class WeightageArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of array n:");
		int n = input.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		//call method in findweight
		findWeight(arr);

	}

	 static void findWeight(int[] arr) {
		int weight = 0;
		int weightage[][] = new int[arr.length][2];
		
		 for(int i=0; i<arr.length; i++) {
			 if(perfactSquare(arr[i])) {
				 weight += 5;
			 }
			 if(divisible46(arr[i])) {
				 weight += 4;
			 }
			 if(evenCheck(arr[i])) {
				 weight += 3;
			 }
			 weightage[i][0] = arr[i];
			 weightage[i][1] = weight;
			 weight = 0;
		 }
		 //sort weight in descending order
		 for (int i = 0; i < weightage.length - 1; i++) {
		        for (int j = 0; j < weightage.length - 1 - i; j++) {
		            if (weightage[j][1] < weightage[j + 1][1]) {
		                int[] temp = weightage[j];
		                weightage[j] = weightage[j + 1];
		                weightage[j + 1] = temp;
		            }
		        }
		    }

		    for (int i = 0; i < weightage.length; i++) {
		        System.out.print("<" + weightage[i][0] + "," + weightage[i][1] + ">");
		    }
	}
	 //if even number
	static boolean evenCheck(int i) {
		if(i % 2 == 0) return true;
		return false;
	}
	//
	static boolean divisible46(int i) {
		if(i % 4 == 0 && i % 6 ==0) {
			return true;
		}
		return false;
	}
	//check perfact square
	static boolean perfactSquare(int number) {
		for(int i=1; i*i<=number; i++) {
			if(i*i == number) {
				return true;
			}
		}
		return false;
	}

}
