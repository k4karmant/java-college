import java.util.*;
public class SimInt {
    public static void main(String[] args)
    {
        double p,r,t,si;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        p=sc.nextDouble();

        System.out.println("Enter rate of interest:");
        r=sc.nextDouble();  

        System.out.println("Enter time in years:");
        t=sc.nextDouble();

        si=(p*r*t)/100.00;

        System.out.println("The Simple Interest Is:" + si);

        sc.close();
    }
}
