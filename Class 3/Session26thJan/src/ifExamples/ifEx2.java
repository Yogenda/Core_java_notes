package ifExamples;

import java.util.Scanner;
// IF-Else
public class ifEx2 {
// Accept a number, then check that number even / odd
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = sc.nextInt();
		
		if(n%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		/*
		 * if(n%2!=0)
			System.out.println("Odd Number");
		else
			System.out.println("Even Number");
		 */
		 
	}
}
