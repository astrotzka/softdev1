import java.util.Scanner;
public class Inputs {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String n;

    System.out.print("Enter your first name: ");
    n = input.next();

        int num;
        System.out.print("Enter a whole number: ");
        num = input.nextInt();

        double dec;

        System.out.print("Enter a decimal number: ");
        dec = input.nextDouble();

    System.out.println ("");
    System.out.println (n + ", you entered yhe numbers " + num + " and " + dec);

    input.close();

    }
}
