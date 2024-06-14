import java.util.*;
public class Classroom 
{
    private static int Area(int l, int b)
    {
        return l*b;
    }
    
    private static void getData()
    {
        int l;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of room:");
        l=sc.nextInt();
        System.out.println("Enter breadth of room:");
        b=sc.nextInt();
        sc.close();
        printArea(l,b);
    }
    
    private static void printArea(int l, int b)
    {
        int area = Area(l,b);
        System.out.println("Area of room: " + area + " square units");
    }
    public static void main(String[] args)
    {
        getData();
    }    
}
