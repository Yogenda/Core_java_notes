package nestedloops;
/*
 * 1 2 3
 * 1 2 3
 * 1 2 3
 */
public class nslp2 {

	public static void main(String[] args) {
		int x = 1;
		while(x<=3)
		{
			int y = 1;
			while(y<=3)
			{
				System.out.print(y + "  ");
				y++;
			}
			System.out.println();
			x++;
		}	
		
		System.out.println("Using For Loop : ");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		
	}

}
