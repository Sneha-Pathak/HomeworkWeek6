/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme
 */
public class CallingProgram4
{
    //4.1 Declare two instance and two static variables
    int a = 5, b = 10;
    static String s1 = "Hello", s2 = " Everyone";

    //4.2 Declare one instance method.
    void method1()
    {
        System.out.println("Method 1 is running...");
        //4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println(a);
        System.out.println(b);
        System.out.print(s1);
        System.out.println(s2);
    }

    //4.3 Declare one static method.
    static void method2()
    {
        System.out.println("Method 2 is running...");
        //4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.

        CallingProgram4 program4 = new CallingProgram4();
        System.out.println(program4.a);
        System.out.println(program4.b);
        System.out.print(s1);
        System.out.println(s2);
    }

    //4.5 Declare the Main method.
    public static void main(String[] args)
    {
        //4.6 Call both instance and static methods into the Main method and run the programme
        CallingProgram4 callingProgram4 = new CallingProgram4();
        callingProgram4.method1();
        method2();
    }
}
