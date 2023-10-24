package arrayZoho;

import java.util.Scanner;

public class GrandChildren {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the no of Rows:");
		int r=input.nextInt();
		
		String arr[][] = new String[r][2];
		
		System.out.println("child ,parant name:");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = input.next();
			}
			System.out.println();
		}
		
		for (int i = 0; i < r; i++) {
			System.out.print("{");
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("}");
            System.out.println("");
        }
		
		int childrens = findGrandChildren(arr);
		
		System.out.println("the count of grandChildrens"+ childrens);
	}

	public static int findGrandChildren(String[][] arr) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter child name:");
		String cName=input.nextLine();
		
		String childName = "";
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i][1].equals(cName)) {
				childName = arr[i][0];
				System.out.println("child name is:"+childName);
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i][1].equals(childName)) {
				count++;
			}
		}
		return count;
	}
}
