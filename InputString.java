import java.util.Scanner;
public class InputString {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String n;

    System.out.print("Enter your first name: ");
    n = input.next();

    System.out.println ("Hello " + n);
    }
}
