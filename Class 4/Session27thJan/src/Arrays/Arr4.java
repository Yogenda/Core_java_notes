package Arrays;

import java.util.Scanner;
//Accept n number of values into an array, 
//then search particular value existancy in array. 
//[10,3,4,34,9]
// search value : 4
// value existed
//search value : 12
//value not existed
public class Arr4 {

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
		System.out.println("Array Values ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i] + "  ");
		}
		
		System.out.println("\nEnter Search Value : ");
		int search = sc.nextInt();
		boolean chk = false;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==search)
				chk = true;
		}
		
		if(chk==true)
			System.out.println("Value existed in array");
		else
			System.out.println("Value not existed in array");
	}

}
