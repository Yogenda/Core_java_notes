package switchExamples;
import java.util.Scanner;
public class SwtEx1 {
// Demo Example of Switch
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. India\n2. UK\n3. Canada");
		System.out.println("Pick ur choice : ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Study in India");
			break;
		case 2:
			System.out.println("Study in UK");
			break;
		case 3:
			System.out.println("Study in Canada");
			break;
		default :
			System.out.println("Invalid Option");
			break;
		}

	}

}
