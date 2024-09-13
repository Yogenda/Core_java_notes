package nestedloops;
/*
 * Print all palindrome numbers b/w 1-100;
 */
public class nslp6 {

	public static void main(String[] args) {

		for(int i=1;i<=100;i++)
		{
			int n = i;
			int rev=0;
			while(n>0)
			{
				int r = n%10;
				rev = rev*10+r;
				n = n/10;
			}
			if(i==rev)
				System.out.print(i + "  ");
		}
	}

}
