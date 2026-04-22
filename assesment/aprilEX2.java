package assesment;
import java.util.Scanner;

public class aprilEX2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("amount of money spent: ");
        a = input.nextInt();
        if(a >= 200){
            System.out.println("your discount is platinum");
        }else if(a >= 150 && a < 200){
            System.out.println("your discount is gold");
        }else if(a >= 100 && a < 150){
            System.out.println("your discount is silver");
        }else if(a >= 50 && a < 100){
            System.out.println("your discount is bronze");
        }else if(a >= 1 && a < 50){
            System.out.println("you have no discount");
        }else if(a == 0){
            System.out.println("bought nothing? aight bye");
        }else if(a < 0){
            System.out.println("Invalid Value, did you steal something you thief?");
        }
    }
}