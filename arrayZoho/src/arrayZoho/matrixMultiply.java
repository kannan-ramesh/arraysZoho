package arrayZoho;
import java.util.Arrays;
import java.util.Scanner;

public class matrixMultiply {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int arr[][] = {	{1,2},{3,4}};
		int arr1[][] = {{5,6,7},{8,9,10}};
		
		int ans[][]= new int[2][3];
		int sum=0;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<ans.length;k++) {
					sum+=arr[i][k]*arr1[k][j];
				}
				ans[i][j]=sum;
				sum=0;
			}
		}
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(Arrays.toString(ans[i]));
		}

	}

}
