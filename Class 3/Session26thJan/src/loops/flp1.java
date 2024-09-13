package loops;

public class flp1 {
// Demo of For Loop
	public static void main(String[] args) {
		
		for(int n=1;n<=10;n++)
		{
			System.out.print(n + "\t");
		}
		
		System.out.println();  //line break
		
		int x = 1;
		for(;x<=10;x++)
		{
			System.out.print(x + "\t");
		}
		
System.out.println();  //line break
		
		x = 1;
		for(;x<=10;)
		{
			System.out.print(x + "\t");
			x++;
		}
		
		System.out.println();  //line break
		
		x = 1;
		for(;;)
		{
			System.out.print(x + "\t");
			x++;
			if(x==11)
				break;
		}
		System.out.println();  //line break
		for(int n=1;;n++)
		{
			System.out.print(n + "\t");
			if(n==10)
				break;
		}
	}

}