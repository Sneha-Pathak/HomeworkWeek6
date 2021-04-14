// 9. Write a program to convert the upper case to lower case.

import java.util.Locale;
import java.util.Scanner;

public class UpperToLower
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter name in Upper case : ");
        String name = n.next();

        String a= name.toLowerCase(Locale.ROOT);
        System.out.println(a);
        n.close();
    }
}
