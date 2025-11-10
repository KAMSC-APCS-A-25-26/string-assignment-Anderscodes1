import java.util.Scanner;

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
        
        if (palindrome)
        {
            System.out.print(word + " is a palindrome!");
        }
        else {
            System.out.print(word + " is NOT a palindrome.");
        }
    }
}
