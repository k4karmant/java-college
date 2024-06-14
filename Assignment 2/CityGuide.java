import java.util.*;

public class CityGuide 
{
    public static void main(String[] args)
    {
        String city;
        Scanner sc = new Scanner(System.in);

        System.out.println("M-Mumbai");
        System.out.println("D-Delhi");
        System.out.println("A-Ahmedabad");
        System.out.println("C-Calcutta");
        System.out.print("Enter your choice:");
        city = sc.next();
        city = city.toUpperCase();
        System.out.println("You have chosen: ");
        switch(city)
        {
            case "M":
                System.out.print("Mumbai");
                break;

            case "D":
                System.out.print("Delhi");
                break;

            case "A":
                System.out.print("Ahmedabad");
                break;

            case "C":
                System.out.print("Calcutta");
                break;
            
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }    
}
