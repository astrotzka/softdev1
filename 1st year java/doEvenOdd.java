import java.util.Scanner;
public class doEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        String y;
        do{
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if(num % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
            System.out.print("Do you want to continue? (y/n): ");
            y = input.next();
        }while(y.equalsIgnoreCase("y"));
    }
}
