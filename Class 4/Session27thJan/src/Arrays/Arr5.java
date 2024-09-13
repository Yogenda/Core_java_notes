package Arrays;

public class Arr5 {

	public static void main(String[] args) {
		int x[][] = {{10,20,30},{40,50,60}};
		System.out.println("First Value : " + x[0][0]);
		
		System.out.println(x[0][0] + "\t" + x[0][1] + "\t" + x[0][2]);
		System.out.println(x[1][0] + "\t" + x[1][1] + "\t" + x[1][2]);
		System.out.println("Array Values ");
		for(int i=0;i<2;i++) // rows
		{
			for(int j=0;j<3;j++) // cols
			{
				System.out.print(x[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
