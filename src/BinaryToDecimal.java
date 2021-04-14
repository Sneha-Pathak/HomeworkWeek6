/* 17. Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5

Expected Output
Binary number is: 101

*/

import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        convert();
    }

    public static void convert()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Binary representation of : ");
        int no = scanner.nextInt();

        System.out.println(Integer.toBinaryString(no));

        scanner.close();
    }
}
