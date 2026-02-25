import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int balance = 1000, choice, withdraw;

        System.out.println("Welcome to ATM");
        System.out.println("Would you like to:");
        System.out.println("1. check balance");
        System.out.println("2. deposit money");
        System.out.println("3. Withdraw money");
        System.out.print("Enter your choice:");
        choice = input.nextInt();
        if(choice == 1){
            System.out.println("Balance: " + balance);
        }else if(choice == 2){
            System.out.print("Enter the amount to deposit: ");
            balance = balance + input.nextInt();
            System.out.println("Balance: " + balance);
        }else if(choice == 3){
            System.out.print("Enter the amount to withdraw:");
            withdraw = input.nextInt();
            if (withdraw > balance){
                System.out.println("Insufficient balance");
            }else{
                balance = balance - withdraw;
            }
            System.out.println("Balance:" + balance);
        }else{
            System.out.println("invalid choice");
        }input.close();
    }
}
