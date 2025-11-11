import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Example input:  ");
        String word = sc.nextLine();

        String word1 = word.replace("oops","***");
        String word2 = word1.replace("nuts","***");
        String word3 = word2.replace("dang","***");
        String word4 = word3.replace("yikes","***");
        System.out.print("Example Output: Censored: " + word4);

        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}
