/* 16. Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11

Expected Output:
Sum of two binary numbers: 101

*/

import java.util.Scanner;

public class BinaryAddition
{
    public static void main(String[] args)
    {
        //calling Method using class object
        BinaryAddition binaryAddition = new BinaryAddition();
        binaryAddition.add();
    }

    //Instance Method
    public void add()
    {
        System.out.println("Welcome to Java program to add two binary numbers");

        //Enter binary nos using scanner
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter first binary number");
        String first = scnr.nextLine();

        System.out.println();

        System.out.print("Please enter second binary number");
        String second = scnr.nextLine();

        //Converting binary nos into integer
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);

        //sum of binary nos
        int sum = b1 + b2;

        //convert sum into binary and print
        String addition = Integer.toBinaryString(sum);
        System.out.println("addition of two binary number is : " + addition);

        scnr.close();
    }
}
