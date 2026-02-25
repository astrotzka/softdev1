import java.util.Scanner;
public class EvenOd {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        number %= 2; // number = number % 2;
        if (number == 0){
            System.out.println("The number you entered was even");
        }else{
            System.out.println("the number you entered was odd");
        }
    }
}
