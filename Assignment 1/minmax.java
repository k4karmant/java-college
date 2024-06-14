import java.util.Scanner;
public class minmax 
{
    public static void main(String[] args)
    {
        int a[] = new int [10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 number:");
        for(int i = 0; i<10; i++)
        {
            System.out.println("Number " + (i+1) + ": ");
            a[i]=sc.nextInt();
        }

        sc.close();
        int min=a[0], max=a[9];
        for(int i = 0; i<10; i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }

            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.println("Greatest Number: " + max);
        System.out.println("Smallest Number: " + min);
    }    
}
