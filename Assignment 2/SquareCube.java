import java.util.*;

public class SquareCube
{
    public static void main(String[] args)
    {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        num = sc.nextInt();

        sc.close();

        System.out.println("Square: " + num*num);
        System.out.println("Cube: " + num*num*num);
    }

}