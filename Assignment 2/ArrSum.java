import java.util.*;

public class ArrSum 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        
        int arr[] = new int[n];
        int sum = 0;
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Position " + (i+1) + ": ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        System.out.print("Sum of all the elements of the array: " + sum);

        sc.close();
    }    
}
