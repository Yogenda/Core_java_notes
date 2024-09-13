package Arrays;

import java.util.Scanner;

public class Arr9 {
	// Accept values in 3x3 matrix, then print it's transpose matrix
	
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

	
		System.out.println("Matrix Format ");
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<3;j++) // cols
			{
				System.out.print(x[i][j] + "  ");			
			}
			System.out.println();
		}
	
		
		System.out.println("Transpose Matrix Format ");
		for(int i=0;i<3;i++) // rows
		{
			for(int j=0;j<3;j++) // cols
			{
				System.out.print(x[j][i] + "  ");			
			}
			System.out.println();
		}
	}

}
