package assesment;
import java.util.Scanner;

public class aprilEX6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        if ( n < 100){
            System.out.println("the number you inputed is less than 100");
        }else{
            System.out.println("the number you inputed is not less than 100");
        }
    }
}
