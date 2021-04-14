/* 1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class InstancePractice
{
    //1.1 Declare two instance variables.
    int v1 = 10, v2 = 20;

    //1.2 Declare one instance method.
    void m1()
    {
        System.out.println("First Method called...");

        //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println("Variable 1 : " + v1);
        System.out.println("Variable 2 : " + v2);
    }

    void m2()
    {
        System.out.println("Second Method called...");

        //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println("Variable 1 : " + v1);
        System.out.println("Variable 2 : " + v2);
    }

    //1.4 Declare the Main method.
    public static void main(String[] args)
    {
        //1.5 Call the above instance method into the Main method and Run the programme.
        InstancePractice call = new InstancePractice();
        call.m1();
        call.m2();
    }
}
