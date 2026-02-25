import java.util.Scanner;
public class LoopCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int num;
        System.out.print("Want to loop?(0 for yes, 1 for no): ");
        num = input.nextInt();
        while(num == 0){
            System.out.print("loop again?(0 for yes, 1 for no): ");
            num = input.nextInt();
            count++;
            if(num == 1){
                System.out.println("You looped " + count + " times.");
                break;
            }else if (num != 0 && num != 1){
                System.out.println("Invalid input, try again.");
            }
        }

    }
}
