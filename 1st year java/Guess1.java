import java.util.Scanner;
public class Guess1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0, ans = 5, count = 0;
        while(num != ans){
            System.out.print("Enter your guess: ");
            count ++;
            num = input.nextInt();
        }if(num == ans){
            System.out.println("Good guess. the number is " + ans + " and you got it in " + count + " attempts.");
        }
    }   
}
