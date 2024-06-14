import java.util.*;

public class Strcmp
{
    public static void main(String[] args)
    {
        String str1,str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1:");
        str1=sc.nextLine();
        
        System.out.println("Enter string 2:");
        str2=sc.nextLine();

        if(str1.equals(str2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
        sc.close();

    }    
}
