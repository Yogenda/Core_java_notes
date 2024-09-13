package ifExamples;

import java.util.Scanner;
// Simple If
public class ifEx1 {
// Accept a number, then check that number is +ve / -ve value
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = sc.nextInt();
		
		if(n>0)
			System.out.println("Value is +Ve");
		
		if(n<0)
			System.out.println("Value is -ve");
		
		if(n==0)
			System.out.println("Value is Zero");
	}
}
