import java.util.Scanner;
public class StringLength {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.println("Number of charaters in " + word + " is " + word.length());
        input.close();
    }
    
}
