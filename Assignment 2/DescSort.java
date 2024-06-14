import java.util.*;

public class DescSort 
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

        System.out.println("Array before sorting:");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Array after sorting:");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }    
}
