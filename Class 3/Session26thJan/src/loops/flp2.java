package loops;

public class flp2 {
// print all even numbers b/w 1 - 20 and vice versa. 
	public static void main(String[] args) {
		
		for(int x=2;x<=20;x+=2)
		{
			System.out.print(x + "\t");
		}
		System.out.println("\n-------------");
		for(int x=20;x>=1;x--)
		{
			if(x%2==0)
				System.out.print(x + "\t");
		}
	}

}
