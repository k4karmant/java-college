import java.util.*;
public class Calc {
    public static void main(String[]  args)
    {
        int a=0;
        int b=0;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Choose an arithmetic operation from below:");
            System.out.println("1.Addition");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter operation number:");
            choice=sc.nextInt();
            
            if(choice!=5)
            {
                System.out.println("Enter number 1:");
                a=sc.nextInt();
                
                System.out.println("Enter number 2:");
                b=sc.nextInt();
            }

            switch(choice)
            {
                case 1:
                    System.out.println("Answer: " + (a+b));
                    break;

                case 2:
                    System.out.println("Answer: " + (a-b));
                    break;

                case 3:
                    System.out.println("Answer: " + (a*b));
                    break;

                case 4:
                    if(b==0)
                    {
                        System.out.println("Invalid operation, division by 0 not possible.");
                        break;
                    }
                    System.out.println("Answer: " + ((float)a/(float)b));
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
