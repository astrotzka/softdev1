import java.util.Scanner;
public class Sign {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (number == 0){
            System.out.println("Your number is 0");
        }else if(number > 0){
            System.out.println(number + " is bigger than 0");
        }else if(number < 0){
            System.out.println(number + " is smaller than 0");
        }
    input.close();
    }
}
