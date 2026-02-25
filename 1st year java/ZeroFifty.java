import java.util.Scanner;
public class ZeroFifty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        do{
            System.out.print("Enter a number betwen 0 and 50(any other number to quit): ");
            i = input.nextInt();
        }while(i >= 0 && i <= 50);
        System.out.println("number outside 0-50, program ends");
        
    }
}
