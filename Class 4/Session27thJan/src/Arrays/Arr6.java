package Arrays;

import java.util.Scanner;

public class Arr6 {
// calculate sum of diagonal elements in 3x3 matrix
	public static void main(String[] args) {
		int x[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 9 values");
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<3;j++) // cols
			{
				x[i][j] = sc.nextInt();
			}
		}

		int sum = 0;
		System.out.println("Array Values ");
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<3;j++) // cols
			{
				System.out.print(x[i][j] + "  ");
				if(i==j)
					sum = sum+x[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Sum of Diagonal Elements : " + sum);
	}

}
