package arrayZoho;
import java.util.Arrays;
import java.util.Scanner;

public class matrixMultiply {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
//			{	{1,2},{3,4}};
//			{{5,6,7},{8,9,10}};
			
	        System.out.println("Enter first array(matrix) (row and column):");
	        int row1 = input.nextInt();
	        int col1 = input.nextInt();

	        System.out.println("Enter  second array (row and column):");
	        int row2 = input.nextInt();
	        int col2 = input.nextInt();
	        
	        if (col1 != row2) {
	            System.out.println("Matrix multiplication is not possible.");
	            return;
	        }

	        int arr[][] = new int[row1][col1];
	        int arr1[][] = new int[row2][col2];

	        System.out.println("Enter elements first array:");
	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < col1; j++) {
	                arr[i][j] = input.nextInt();
	            }
	        }

	        System.out.println("Enter elements of the second array:");
	        for (int i = 0; i < row2; i++) {
	            for (int j = 0; j < col2; j++) {
	                arr1[i][j] = input.nextInt();
	            }
	        }
	        
		int ans[][]= new int[row1][col2];
		int sum=0;
		//call method multiplication in two array
		matrixmultiplication(arr,arr1,ans,sum);
	}

	private static void matrixmultiplication(int[][] arr, int[][] arr1, int[][] ans, int sum) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<ans.length;k++) {
					sum+=arr[i][k]*arr1[k][j];
				}
				ans[i][j]=sum;
				sum=0;
			}
		}
		//print array
		for(int i=0;i<ans.length;i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
	}

}
