import java.util.*;

public class ArrSearch 
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

        int key;

        System.out.println("Enter key to be searched:");
        key = sc.nextInt();

        for (int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Key found at index " + (i+1));
            }
        }

        sc.close();
    }    
}
