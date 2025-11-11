import java.util.Scanner;

<<<<<<< HEAD
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int start = 0;
        int end = word.length() - 1;
        boolean palindrome = false;

=======
public class PalindromeChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        int start = 0;
        int end = word.length() - 1;
        boolean palindrome = false;
        
>>>>>>> 74ca9e75251234c056a5d630df578baa2a5bca69
        for (int i=0; i<word.length(); i++)
        {
            if (word.charAt(i) == word.charAt(word.length() - i - 1))
            {
                palindrome = true;
            }
            else {
                palindrome = false;
            }
        }
<<<<<<< HEAD

=======
        
>>>>>>> 74ca9e75251234c056a5d630df578baa2a5bca69
        if (palindrome)
        {
            System.out.print(word + " is a palindrome!");
        }
        else {
            System.out.print(word + " is NOT a palindrome.");
        }
<<<<<<< HEAD





        // TODO: Create a Scanner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.

        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)

        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.

        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).
=======
>>>>>>> 74ca9e75251234c056a5d630df578baa2a5bca69
    }
}
