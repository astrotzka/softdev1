import java.util.Scanner;
public class Small {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number = 0;
        int num = 0;
        int smallest = 0;
        System.out.print("Enter a number of integers: ");
        num = input.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print("Enter integer " + i + ": ");
            number = input.nextInt();
            if(i == 1){
                smallest = number;
            }else{
                if(number < smallest){
                    smallest = number;
                }
            }
        }System.out.println("The smallest number is: " + smallest)
        ;

    }
}
