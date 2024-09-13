package Arrays;

import java.util.Scanner;
//Accept n number of values into an array, then find biggest number from
// that array values. 
//[10,3,4,34,9]
// big 34
public class Arr3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array ");
		int n = sc.nextInt();
		
		int x[] = new int[n];
		
		System.out.println("Enter " + x.length + " Values ");
		for(int i=0;i<x.length;i++)
		{
			x[i] = sc.nextInt();
		}
		int big = 0;
		System.out.println("Array Values : ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "  ");
			if(big<x[i])
				big = x[i];
		}
		
		System.out.println("\nBiggest Value : " + big);
	}

}
