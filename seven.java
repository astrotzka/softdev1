import java.util.Scanner;
public class seven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number == 7){
            System.out.println("Number entered is " + number + ", is equal to 7");
        }else{
            System.out.println("Number entered is " + number + ", is not equal to 7");
        }
    }
}
