package switchExamples;

public class SwtEx3 {
// Demo Example of Switch : check given alphabet is vowel or not
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter any alpahabet : ");
		int ch = System.in.read();
		
		System.out.println("Given Char : " + (char)ch);
		/*
		 * read() : this method allows read a char and returns it's ascii value
		 * System.in.read();
		 * it will raise an execption
		 */
		switch((char)ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is Vowel");
			break;
			
		default :
			System.out.println("It is not vowel");
			break;
		}
	}

}
