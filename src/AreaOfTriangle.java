/*
8. Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String args[])
    {
        calculate();
    }

    static void calculate()
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double w= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double h= s.nextDouble();

        //Area = (width*height)/2
        double area=(w*h)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}
