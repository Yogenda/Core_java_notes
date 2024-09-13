package ifExamples;

import java.util.Scanner;
// else if
public class ifEx4 {
// Accept 3  numbers, then find the big number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 values : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y && x>z)
			System.out.println(x + ", " + y + " and " + z + "  big number " + x);
		else if(y>x && y>z)
			System.out.println(x + ", " + y + " and " + z + "  big number " + y);
		else if(z>x && z>y)
			System.out.println(x + ", " + y + " and " + z + "  big number " + z);
		else
			System.out.println("Any two / all values are same");
	}
}
