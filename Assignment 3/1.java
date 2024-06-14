import java.util.*;
class GCD
{
	public static int gcd(int num1, int num2)
	{
		int gcd = 1;
		for(int i = 1;(i < num1) || (i < num2);i++)
		{
			if((num1%i == 0) &&  (num2%i == 0))
			{
				gcd = i;
			}
		}
		return gcd;
	}

	public static void main(String[] args)
	{
		int no1, no2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1:");
		no1 = sc.nextInt();

		System.out.println("Enter number 2:");
		no2 = sc.nextInt();

		int g=gcd(no1,no2);

		System.out.println("Greatest Common Divisor: " + g);		
	}
}