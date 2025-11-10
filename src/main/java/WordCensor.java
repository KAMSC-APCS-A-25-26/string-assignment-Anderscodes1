import java.util.Scanner;

public class WordCensor
{
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Example input: ");
        String word = sc.nextLine();
        
        String word1 = word.replace("oops","***");
        String word2 = word1.replace("nuts","***");
        String word3 = word2.replace("dang","***");
        String word4 = word3.replace("yikes","***");
        System.out.print("Example Output: Censored: " + word4);
    }
}
