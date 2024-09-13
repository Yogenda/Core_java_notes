package loops;

import java.util.Scanner;

public class dow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		float grTotal = 0.0f;
		do
		{
		System.out.println("Product Name : ");
		String pname = sc.next();
		
		System.out.println("Product Price : ");
		float price = sc.nextFloat();
		
		System.out.println("No of Products ");
		int nop = sc.nextInt();
		
		float total = price*nop;
		grTotal =grTotal+total;
		
		System.out.println("Total Amount : " + total);
		System.out.println("1 more product(y/n)");
		ch = sc.next();
		}
		while(ch.equals("y") || ch.equals("Y"));
		
		System.out.println("Grand Total : " + grTotal);
		
	}

}
