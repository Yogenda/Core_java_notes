package Arrays;

import java.util.Scanner;

public class Arr10 {
	// Write a program to calculate addition and substrction of two matrixes.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the 1st matrix ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		System.out.println("Enter size of the 2nd matrix ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		if(r1==r2 && c1==c2)
		{
			int x[][] = new int[r1][c1];
			int y[][] = new int[r2][c2];
			
			System.out.println("Enter  " + r1*c1 + " values for 1st matrix");
			for(int i=0;i<r1;i++) // rows
			{
				for(int j=0;j<c1;j++) // cols
				{
					x[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter  " + r2*c2 + " values for 2nd matrix");
			for(int i=0;i<r2;i++) // rows
			{
				for(int j=0;j<c2;j++) // cols
				{
					y[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("1st Matrix Format ");
			for(int i=0;i<r1;i++) // rows
			{
				for(int j=0;j<c1;j++) // cols
				{
					System.out.print(x[i][j] + "  ");			
				}
				System.out.println();
			}
			
			System.out.println("2nd Matrix Format ");
			for(int i=0;i<r2;i++) // rows
			{
				for(int j=0;j<c2;j++) // cols
				{
					System.out.print(y[i][j] + "  ");			
				}
				System.out.println();
			}
			
			
			System.out.println("Addition Matrix Format ");
			for(int i=0;i<r1;i++) // rows
			{
				for(int j=0;j<c1;j++) // cols
				{
					System.out.print((x[i][j]+y[i][j]) + "  ");			
				}
				System.out.println();
			}
			
			System.out.println("Minus Matrix Format ");
			for(int i=0;i<r1;i++) // rows
			{
				for(int j=0;j<c1;j++) // cols
				{
					System.out.print((x[i][j]-y[i][j]) + "  ");			
				}
				System.out.println();
			}
		}
		else
			System.out.println("Invalid Size of the matrix");
	}

}
