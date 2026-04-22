package assesment;
import java.util.Scanner;
public class aprilEX5 {
    public static void main(String[]args){;
    Scanner input = new Scanner(System.in);
    String s;

    System.out.print("Enter a string: ");
    s = input.next();
    System.out.println("Your string has " + (s.length()) + " charachters");

    input.close();
    }

}

