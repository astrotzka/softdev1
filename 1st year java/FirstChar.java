import java.util.Scanner;
public class FirstChar {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.println("The first character in the word " + word + " is " + word.charAt(0));
        input.close();
    }
    
}
