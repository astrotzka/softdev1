import java.util.Scanner;
public class SquaresArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i * i;
        }
        System.out.println(total);
    }
}
