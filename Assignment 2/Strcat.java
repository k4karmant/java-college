import java.util.*;

public class Strcat
{
    public static void main(String[] args)
    {
        String str1,str2,res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1:");
        str1=sc.nextLine();
        
        System.out.println("Enter string 2:");
        str2=sc.nextLine();

        res = str1 + " " + str2;
        
        System.out.println("Concated string: " + res);

        sc.close();

    }    
}
