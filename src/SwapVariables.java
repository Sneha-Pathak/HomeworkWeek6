// 15. Write a Java program to swap two variables

import java.util.Scanner;

public class SwapVariables
{
    public static void main(String[] args)
    {
        SwapVariables sv = new SwapVariables();
        sv.swap();
    }

    void swap()
    {
        int x, y, temp;// x and y are to swap

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("before swapping : " + x + "  " + y);
        /*swapping */
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping : " + x + "   " + y);
        System.out.println( );

        sc.close();
    }
}
