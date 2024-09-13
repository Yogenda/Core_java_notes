package nestedloops;
/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 1
 * 2 3 4 5 6
 * 7 8 9 1 2 3
 */
public class nslp5 {

	public static void main(String[] args) {
		int z = 1;
		int x = 1;
		while(x<=10)
		{
			int y = 1;
			while(y<=x)
			{
				System.out.print(z + "  ");
				y++;
				z++;
				
				if(z==10)
					z = 1;
			}
			System.out.println();
			x++;
		}	
		
		System.out.println("Using For Loop : ");
		int k = 1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((k++) + "  ");
				if(k==10)
					k=1;
			}
			System.out.println();
		}
		
	}

}
