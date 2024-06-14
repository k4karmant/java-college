import java.util.*;

public class CharCount
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        str=sc.nextLine();

        System.out.println("Length of string:" + str.length());

        sc.close();

    }    
}
