import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();
        int number2;
        System.out.print("Enter number 2: ");
        number2 = input.nextInt();
        if(number1 == 4 && number2 == 2 || number1 == 2 && number2 == 4){
             System.out.println("your entered numbers were 2 and 4");
        }else if(number1 == 4 || number2 == 4 || number1 == 2 || number2 == 2){
            System.out.println("one of your entered numbers was either 2 or 4");
        }input.close();
    }
}