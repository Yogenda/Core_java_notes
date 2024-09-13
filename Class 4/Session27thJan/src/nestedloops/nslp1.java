package nestedloops;
/*
 * 1 2 3
 * 1 2 3
 * 1 2 3
 */
public class nslp1 {

	public static void main(String[] args) {
		int x = 1;
		while(x<=3)
		{
			System.out.print(x + "  ");
			x++;
		}
		System.out.println();
		x = 1;
		while(x<=3)
		{
			System.out.print(x + "  ");
			x++;
		}
		System.out.println();
		x = 1;
		while(x<=3)
		{
			System.out.print(x + "  ");
			x++;
		}
	}

}
