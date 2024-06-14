import java.util.*;

class Strings
{
    String s;
    int vowel=0, cons = 0, sps = 0;
    Scanner sc = new Scanner(System.in);
    public void getData()
    {
        System.out.print("Enter a string : ");
        s= sc.nextLine();
    }

    public void display() 
    {
        System.out.println("Your entered string is : " + s);
        count_occurence();
    }

    void count_occurence()
    {
        int len = s.length();
        int ctr[] = new int[256];
        for(int i=0;i<len;i++){
            ctr[(int) s.charAt(i)]++;
        }

        for(int i=0; i<256; i++){
            if(ctr[i] != 0){
                System.out.println((char)i+" : "+ctr[i]+" times");
            }
        }
    }

    public static void main(String args[])
    {
       Strings obj = new Strings();
        obj.getData();
        obj.display();
    }
}
