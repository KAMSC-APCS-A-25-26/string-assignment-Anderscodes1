import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Example Input: ");
        String input = sc.nextLine();
        String input1 = input.replace ("oops", "***");
        String input2 = input1.replace ("dang", "***");
        String input3 = input2.replace ("nuts", "***");
        String input4 = input3.replace ("yikes", "***");
        System.out.println("Example Output: Censored: " + input4);
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
    }
}
