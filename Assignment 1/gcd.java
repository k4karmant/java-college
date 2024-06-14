import java.util.Scanner;

public class gcd
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        a=sc.nextInt();

        System.out.println("Enter number 2:");
        b=sc.nextInt();
        sc.close();

        int gcd=1, i;

        for (i=1;(i<=a) && (i<=b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }

        System.out.println("GCD of " + a + " and " + b + ":" + gcd);

        
    }
}
