import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter your  number: ");
        number = input.nextInt();
        if (number >= 1 && number <= 10 || number >= 50 && number <= 100){
            System.out.println(number + " is betwen 1 and 10, or betwen 50 and 100");
        }else{
            System.out.println(number + " is not betwen 1 and 10, or 50 and 100");
        }
        input.close();
    }
}
