package arrayZoho;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = input.next();
		
		int n=str.length();
		
		
		boolean odd = findOdd(n);
		
		if(odd) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==j || i+j == n-1) {
						System.out.print(str.charAt(j));
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}else {
			System.out.println(" the string length is even:0");
		}
	}

	public static boolean findOdd(int n) {
		if(n%2 == 0) {
			return false;
		}
		return true;
	}

}
