/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class AverageOfNumbers
{
    public static void main(String[] args)
    {
        average();
    }

    static void average()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + (x + y + z) / 3 +"\n" );
    }
}
