import java.util.*;
public class Array1 
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        Iterator<String> itr = list.iterator();

        System.out.println("Add Three Colours");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        list.add(2,"Brown");

        itr = list.iterator();

        System.out.println("\nAdd Brown at second position");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        list.remove("Green");

        itr = list.iterator();

        System.out.println("\nRemove Green from List");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        list.removeAll(list);

        itr = list.iterator();

        System.out.println("\nRemove All Elements");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
