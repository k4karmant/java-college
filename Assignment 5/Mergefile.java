import java.io.*;
import java.util.*;
public class Mergefile 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        try
        {
            FileOutputStream fin1 = new FileOutputStream("file1.txt");
            FileOutputStream fin2 = new FileOutputStream("file2.txt");

            String str1 = new String();
            String str2 = new String();

            System.out.println("Enter string 1:");
            str1 = sc.nextLine();

            System.out.println("Enter string 2:");
            str2 = sc.nextLine();

            byte b1[] = str1.getBytes();
            byte b2[] = str2.getBytes();

            fin1.write(b1);
            fin2.write(b2);

            fin1.close();
            fin2.close();

            FileReader fout1 = new FileReader("file1.txt");
            FileReader fout2 = new FileReader("file2.txt");
            FileWriter merge = new FileWriter("Merge.txt");

            int temp1;
            StringBuilder s = new StringBuilder();

            while((temp1 = fout1.read()) != -1)
            {
                s.append((char)temp1);
            }
            
            s.append(' ');

            int temp2;

            while((temp2 = fout2.read()) != -1)
            {
                s.append((char)temp2);
            }

            merge.write(s.toString());

            System.out.println("Successfully merged");

            fout1.close();
            fout2.close();
            merge.close();
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

        sc.close();
    }
}