import java.util.Scanner;
public class Test5 {
// Calculate Area of circle : Area = PI*r*r
		//PI = 3.14  (use it as constant
	public static void main(String[] args) {
			final float PI = 3.14f;
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter radius of circle ");
			float radius = scr.nextFloat();
			
			System.out.println("Area of Circle is : " + (PI*radius*radius));
	}

}
