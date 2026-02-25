import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        System.out.print("Enter the third number: ");
        c = input.nextInt();
        System.out.print("Enter the fourth number: ");
        d = input.nextInt();
        System.out.print("Enter the fifth number: ");
        e = input.nextInt();

        a += 9;
        b -= 4;
        c *= 3;
        d /= 2;
        e %= 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
