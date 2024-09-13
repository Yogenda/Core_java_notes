package switchExamples;
import java.util.Scanner;
public class SwtEx4 {
// Demo Example of Switch : Accept two values 
	//then perform arithematic operations based on choice
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Addition\n2. Substraction");
		System.out.println("Pick ur choice : ");
		int ch=sc.nextInt();
		if(ch==1 || ch==2)
		{
			System.out.println("Enter two values : ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Addition " + (x+y));
				break;
			case 2:
				System.out.println("MInus " + (x-y));
				break;
			}
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}
