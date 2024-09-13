package Arrays;

public class Arr7 {
// jagged array
	public static void main(String[] args) {
		int x[][] = {{10,20,30}, {40,50}, {70,80,90,67}};
		
		System.out.println("No of Rows : " + x.length);
		System.out.println("No of Values in First Row " + x[0].length );
		System.out.println("No of Values in Second Row " + x[1].length );
		System.out.println("No of Values in Third Row " + x[2].length );
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j] + "  ");
			}
			System.out.println();
		}
	}
//x[0]
//x[1]
//x[2]
}
