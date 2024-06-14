import java.util.*;
public class NumCheck 
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check: ");
        num=sc.nextInt();

        if(num==0)
        {
            System.out.println("Number is Zero");
        }
        else if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Number is Negative");
        }

        sc.close();
    }    
}
