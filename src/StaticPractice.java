/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme
 */

public class StaticPractice
{
   //2.1 Declare two static variables

    static String s1 = "Sneha", s2 = " Pathak";

    //2.2 Declare one static method
    static void method1()
    {
        System.out.println("Method 1...");
        //2.3 Call both static variables into the static method inside the print statement.
        System.out.print(s1);
        System.out.println(s2);
    }

    static void method2()
    {
        System.out.println("Method 2...");
        //2.3 Call both static variables into the static method inside the print statement.
        System.out.print(s1);
        System.out.println(s2);
    }

    //2.4 Declare the Main method.
    public static void main(String[] args)
    {
        //2.5 Call the static method into the Main method and Run the programme
        method1();
        method2();
    }
}
