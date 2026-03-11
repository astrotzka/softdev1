package assesment;
import java.util.Scanner;//imports the Scanner
public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //names "input" as a variable of the Scanner
        String i = "input"; //creates a string called i, its value is irelevant tho
        int n = 1;//creates an integer called a with the value of 1
        System.out.print("Enter some text: ");//makes the user input some text
        i = input.nextLine();//gives the string i the value of the inputed text
        while(n <= 11){
            System.out.println(n + ". " + i);
            n++;
        }//while loop, as long as n is lower than 12, it will print n and i, adding +1 to n each time
        input.close();//closes input
    }
}
