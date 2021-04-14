/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class CallingProgram3
{
    //3.1 Declare one instance and one static variable.
    static int var1 = 10;
    int var2 = 20;

    //3.2 Declare one instance method.
    void m1()
    {
        System.out.println("m1 called...");
        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println(var1);
        System.out.println(var2);
    }

    //3.3 Declare one static method.
    static void m2()
    {
        System.out.println("m2 called...");
        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println(var1);

        CallingProgram3 program3 = new CallingProgram3();
        System.out.println(program3.var2);
    }

    //3.5 Declare the Main method.
    public static void main(String[] args)
    {
        //3.6 Call both instance and static methods into the Main method and run the programme.
        CallingProgram3 callingProgram3 =new CallingProgram3();
        callingProgram3.m1();
        m2();
    }

}
