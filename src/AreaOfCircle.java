/* 6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class AreaOfCircle
{
    public static void main(String args[])
    {
        circle();
    }

    static void circle()
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}
