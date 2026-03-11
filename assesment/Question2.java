package assesment;
import java.util.Scanner;//imports the Scanner
public class Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//names "input" as a variable of the Scanner
        int n, i = 1;;//creates an integer called i with the value of 1, and one named n with the value of 0
        System.out.print("Enter a number: ");//tells the user to input a number
        n = input.nextInt();// assigns the number inputed by the user to n
        while(n >= 4 && i <= 4){
            System.out.println(i + ". Question 2");
            i++;
        }//while loop for the 4 
        if(n < 4){
            System.out.println("1. Question 2");
            System.out.println( "2. Question 2");
        }//if statement for the 2
        input.close();//closes input
    }
}
