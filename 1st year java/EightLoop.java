import java.util.Scanner;
public class  EightLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        while (count < 6) {
            System.out.println(num + " times " + count + " = " + (num * count));
            count += 1;
        }
    }
}
