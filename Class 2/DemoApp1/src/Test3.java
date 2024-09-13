
public class Test3 {

	public static void main(String[] args) {
		// implicit
		int x = 65;
		System.out.println("X value is : " + x);
		float y = x;
		System.out.println("Y value is : " + y);
		
		//long z = y;  // it is not possiable with implicit
		// explicit
		long z  = (long)y;
		
		System.out.println("Z value is : " + z);
		
		char ch = (char)x; // it gives it's related ascii value 'A'
		
		System.out.println("Ch  value : " + ch);
		
		int p = 10; // convert decimal (float, double)
		
		float q = p; // implicit  q=10.0
		
		double m = 34.67;
		
		int s = (int)m;  // explicit  s = 34
	}

}
