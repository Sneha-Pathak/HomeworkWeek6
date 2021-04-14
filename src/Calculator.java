import java.util.Scanner;

/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)

 */
public class Calculator
{
    static void addition(int a,int b)
    {
        int c = a + b;
        System.out.println("Addition is : " + c);
    }
    static void subtraction(int a,int b)
    {
        int c = a - b;
        System.out.println("Subtraction is : " + c);
    }
    void multiplication(int a, int b)
    {
        int c = a * b;
        System.out.println("Multiplication is : " + c);
    }
    void division(int a, int b)
    {
        int c = a / b;
        System.out.println("Division is : " + c);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No1 : ");
        int x = sc.nextInt();
        System.out.print("Enter No2 : ");
        int y = sc.nextInt();

        addition(x,y);
        subtraction(x,y);

        Calculator calculator = new Calculator();
        calculator.multiplication(x,y);
        calculator.division(x,y);
    }
}
