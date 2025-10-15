import java.util.Scanner;
public class InputDouble {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        double num;

        System.out.print("Enter a number: ");
        num = input.nextDouble();
        System.out.println("Number entered is: " + num);

    }
}

