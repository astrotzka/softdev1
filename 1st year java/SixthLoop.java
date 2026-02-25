import java.util.Scanner;
public class SixthLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a counter value:");
        count = input.nextInt();
        System.out.println("before loop");
        while (count < 5){
            System.out.println("inside loop counter= " + count);
            count += 1;
        }
        System.out.println("after loop");
    }
}
