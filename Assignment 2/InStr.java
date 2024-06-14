import java.util.Scanner;

public class InStr 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character you want to find: ");
        char ch = sc.next().charAt(0);

        int[] positions = findAllCharacterPositions(str, ch);

        if (positions.length > 0) 
        {
            System.out.print("The character '" + ch + "' is found at positions: ");
            for (int position : positions) {
                System.out.print(position + " ");
            }
        } 
        else 
        {
            System.out.println("The character '" + ch + "' was not found in the string.");
        }

        sc.close();
    }

    public static int[] findAllCharacterPositions(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        int[] positions = new int[count];
        int index = 0;

        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == ch) 
            {
                positions[index] = i + 1;
                index++;
            }
        }

        return positions;
    }
}
