import java.util.Scanner;
public class Remainder {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        int num1 = 0, num2 = 0;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter your second number: ");
        num2 = input.nextInt();

        System.out.println("Remainder when " + num1 + " is divided by " + num2 + " is: " + (num1 % num2));

        input.close();

    }
    
}