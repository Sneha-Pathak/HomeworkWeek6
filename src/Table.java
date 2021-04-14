/*
10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class Table
{
    public static void main(String[] args)
    {
        Table table = new Table();
        table.number();
    }

    public void number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Table : ");
        int no = sc.nextInt();

        for (int x = 1; x <= 10; x++)
        {
            int tb = no * x;
            System.out.println(no + " * " + x + " = " + tb );
        }
    }
}
