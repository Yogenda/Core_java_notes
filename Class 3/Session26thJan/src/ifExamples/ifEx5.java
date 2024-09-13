package ifExamples;

import java.util.Scanner;
// Nested If
public class ifEx5 {
// Accept person age and gender, then check marriage eligibilty
// Male :  age>=21  and Gender=Male
//Female:  age>=18  and Gender=Female
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Gender of the Person (Male/Female)");
		String gender = sc.next();
		
		if(gender.equals("Male") || gender.equals("Female"))
		{
			System.out.println("Enter age of the person : ");
			int age = sc.nextInt();

			if(gender.equals("Male"))
			{
				if(age>=21)
					System.out.println("Male Person Eligible for Marriage");
				else
					System.out.println("Male Person Not Eligible for Marriage");
			}
			if(gender.equals("Female"))
			{
				if(age>=18)
					System.out.println("Female Person Eligible for Marriage");
				else
					System.out.println("Female Person Not Eligible for Marriage");
			}
		}
		else
		{
			System.out.println("Invalid Gender");
		}
	}
}
