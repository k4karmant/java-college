import java.util.*;

public class NumPat 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows:");
        num=sc.nextInt();
        
        sc.close();
        
        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
