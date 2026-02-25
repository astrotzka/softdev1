import java.util.Scanner;
public class FifthLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        int num = 0;
        System.out.print("Enter a counter value:");
        count = input.nextInt();
        while (count > 0) {
            num += 1;
            System.out.println("Loop counter: " + num);
            count -= 1;
        }
    }
}