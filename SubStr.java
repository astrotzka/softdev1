import java.util.Scanner;
public class SubStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.next();
        
        System.out.print("Enter the start index: ");
        int start = input.nextInt();
        
        System.out.print("Enter the end index: ");
        int end = input.nextInt();
        
        System.out.println("The substring from " + start + " to " + end + " in the word " + word + " is " + word.substring(start, end));
        
        input.close();
    }
}
