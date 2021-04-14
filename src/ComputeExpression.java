/*
12. Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */

public class ComputeExpression
{
    public static void main(String[] args)
    {
        double x = 25.5, y = 3.5, z = 40.5, w = 4.5, ans;

        ans = (x * y - y * y) / (z - w);
        System.out.println(ans);
    }
}
