package Arrays;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		int x[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + x.length + " Values ");
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		
		System.out.println("Array Values : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "  ");
		}
	}

}
