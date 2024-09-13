package loops;

public class lp2 {
// print all even numbers b/w 1 - 20 and vice versa. 
	public static void main(String[] args) {
		int x = 2;
		while(x<=20)
		{
			System.out.print(x + "  ");
			x=x+2;
		}
		System.out.println("\n-------------");
		x = 20;
		while(x>=1)
		{
			System.out.print(x + "  ");
			x=x-2;
		}
	}

}
