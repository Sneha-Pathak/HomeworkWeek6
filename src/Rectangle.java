import java.util.Scanner;

/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20

 */
public class Rectangle
{
    public static void main(String[] args)
    {
        // Input length and width of rectangle
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle:");
        double l = s.nextDouble();
        System.out.println("Enter the width of the Rectangle:");
        double w = s.nextDouble();

        perimeter(l,w);

        Rectangle rectangle = new Rectangle();
        rectangle.area(l,w);
    }
    static void perimeter(double length, double width)
    {
        // Calculate perimeter  of rectangle
        double  perimeter=2*(length + width);
        System.out.println("perimeter of Rectangle is: " + perimeter);
    }

    void area(double length,double width)
    {
        // Calculate area of rectangle
        double ar = length * width;
        System.out.println("Area of rectangle is " + ar);
    }
}
