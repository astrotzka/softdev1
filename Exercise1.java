import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter your year: ");
        year = input.nextInt();
        if (year%4 == 0){
            System.out.println(year + " ia a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
        input.close();
    }
}
