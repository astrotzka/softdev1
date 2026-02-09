import java.util.Scanner;
public class Times {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int choose = 0;
        int add = 1;
        int max = 12;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        System.out.println("1. Output addition table for number (1 to " + number + ") for number entered");
        System.out.println("2. Output multiplication table for number (1 to " + number + ") for number entered");
        System.out.print("Enter choice: ");
        choose = input.nextInt();
        if (choose == 1 || choose == 2){
            while (add <= max){
                if (choose == 1){
                    System.out.println(number + " + " + add + " = " + (number + add));
                    add++;
                }
                if (choose == 2){
                    System.out.println(number + " * " + add + " = " + (number * add));
                    add++;
                }
            }
        }else {
            System.out.println("Invalid choice");
            }
        }
    }

