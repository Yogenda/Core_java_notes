package loops;

import java.util.Scanner;

public class lp3 {
// Accept a number then print it's factorial value
// 5! = 5x4x3x2x1 = 120
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = sc.nextInt();
		
		int fact = 1;
		while(n>0)
		{
			fact = fact*n;
			n--;
		}
		
		System.out.println("Fact Value is : " + fact);
	}

}
