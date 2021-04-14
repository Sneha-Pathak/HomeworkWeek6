import java.util.Scanner;

/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Sum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number : ");
        int fno = scanner.nextInt();
        System.out.println("Input second number : ");
        int sno = scanner.nextInt();

        int addition = fno + sno;
        int multiply = fno * sno;
        int subtract = fno - sno;
        int divide = fno / sno;
        int remainder = fno % sno;

        System.out.println(fno + " + " + sno + " = " + addition);
        System.out.println(fno + " * " + sno + " = " + multiply);
        System.out.println(fno + " - " + sno + " = " + subtract);
        System.out.println(fno + " / " + sno + " = " + divide);
        System.out.println(fno + " % " + sno + " = " + remainder);
    }
}
