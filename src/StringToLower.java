/* 19. Write a Java program to convert a given string into lowercase.

 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.

 Output: the quick brown fox jumps over the lazy dog.
*/

import java.util.Locale;

public class StringToLower
{
    public static void main(String[] args)
    {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        System.out.println(input.toLowerCase(Locale.ROOT));
    }
}
