import java.util.*;

public class Strcpy
{
    public static void main(String[] args)
    {
        String str,str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        str=sc.nextLine();
        str2 = str;
        
        System.out.println("Original string:" + str);
        System.out.println("Copied string:" + str2);

        sc.close();

    }    
}
