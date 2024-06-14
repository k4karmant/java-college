import java.util.*;

public class MaxNum 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print("Position " + (i+1) + ": ");
            arr[i]=sc.nextInt();
        }

        int max=arr[0];

        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("Maximum element: " + max);

        sc.close();
    }    
}
