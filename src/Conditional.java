import java.util.*;
public class Conditional {

    public static void isOdd()
    {
        int number;
        System.out.print("Type a number: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        if(number % 2 == 0)
        {
            System.out.print("The number is even.");
        }
        else
        {
            System.out.print("The number is odd.");
        }
    }

    public static void isYounger()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Type the first age:");
        int first = s.nextInt();
        System.out.print("Type the second age:");
        int second = s.nextInt();

        if(first > second)
        {
            System.out.print("The first is older");
        }
        else
        {
            System.out.print("The second is older");
        }

    }
}
