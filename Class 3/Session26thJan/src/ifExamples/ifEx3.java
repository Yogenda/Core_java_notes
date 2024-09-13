package ifExamples;

import java.util.Scanner;
// IF-Else
public class ifEx3 {
// Accept a 3 digits number,(100-999) then find sum of invidusal digits
	// n = 123 = 1+2+3 = 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Digits Number(100-999) : ");
		int n = sc.nextInt();
		
		if(n>100 && n<1000)
		{
			int firstDigit = n/100;
			System.out.println("First Digit : " + firstDigit);
			int secondDigit = (n%100)/10;
			System.out.println("Second Digit : " + secondDigit);
			int lastDigit = n%10;
			System.out.println("Last Digit : " + lastDigit);
			
			int sum = firstDigit+secondDigit+lastDigit;
			
			System.out.println("Sum : " + sum);			
		}
		else
			System.out.println("Invalid Number ");
	}
}
