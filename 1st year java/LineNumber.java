import java.util.Scanner;
public class LineNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int LineNumber;
        String sentence;

        System.out.print("Enter a Line Number: ");
        LineNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        input.close();

        System.out.println(LineNumber + ". " + sentence);
    }
}
