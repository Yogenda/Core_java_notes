package loops;

import java.util.Scanner;

public class flp3 {
// Accept a number then print it's Reverse Number
// 123 = 321
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = sc.nextInt();
		
		int rev=0;
		for(;n>0;n/=10)
		{
			int r =n%10;
			rev = rev*10+r;
			//n = n/10;
			System.out.println(n + "\t" + r + "\t" + rev);
		}
		
		System.out.println("Reverse Value is : " + rev);
	}

}
