import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, total = 0;
        while(i != -1){
            System.out.print("Enter number: ");
            i = input.nextInt();
            total += i;
        }
        System.out.println("Sum of numbers is " + (total + 1));
    }
}
