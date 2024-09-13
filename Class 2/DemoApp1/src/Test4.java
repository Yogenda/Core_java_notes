import java.util.Scanner;
public class Test4 {
// Accept a value then print it's square and cube values
	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = scr.nextInt();
		System.out.println(n + " Square Value : " + (n*n));
		System.out.println(n + " Cube Value : " + (n*n*n));
	}

}
