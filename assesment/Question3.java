package assesment;
import java.util.Scanner;//imports the Scanner
public class Question3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);//names "input" as a variable of the Scanner
        int i = 1, c = 0;//creates an integer called i with the value of 1, and another named c with the value of 0
        while(i >= 1){
            System.out.print("Enter a positive number (Enter a value less than 1 to stop): ");
            i = input.nextInt();
            c++;
        }//while loop to make the user inout positive numbers, stops at anything under 1
        System.out.println("You entered " + (c - 1) + " positive numbers.");//prints the amount of positive numbers entered
        input.close();//closes input
    }
}
