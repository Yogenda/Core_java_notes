package switchExamples;
import java.util.Scanner;
public class SwtEx2 {
// Demo Example of Switch : check given alphabet is vowel or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alpahabet : ");
		String str = sc.next();

		switch(str)
		{
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("It is Vowel");
			break;
			
		default :
			System.out.println("It is not vowel");
			break;
		}

	}

}
