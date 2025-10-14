import java.util.Scanner;
public class InputNumber {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println("Number entered is: " + num);

    }
}
