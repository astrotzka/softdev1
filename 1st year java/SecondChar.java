import java.util.Scanner;
public class SecondChar {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.println("The second character in the word " + word + " is " + word.charAt(1));
        input.close();
    }
    
}