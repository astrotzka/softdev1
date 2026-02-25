package club;
import java.util.Scanner;
public class ig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0, m = 0, sum = 0;
        System.out.println("Enter first integer: ");
        n = input.nextInt();
        System.out.println("Enter second integer: ");
        m = input.nextInt();
        sum = n + m;
        System.out.println(sum);
    }
}
