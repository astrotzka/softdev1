import java.util.Scanner;
public class Month {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int month = 0;

        System.out.print("Enter a month number: ");
        month = input.nextInt();
        if (month == 1){
            System.out.println("January");
        }else if (month == 2){
            System.out.println("February");
        }else if (month == 3){
            System.out.println("March");
        }else if (month == 4){
            System.out.println("april");
        }else if (month == 5){
            System.out.println("may");
        }else if (month == 6){
            System.out.println("June");
        }else if (month == 7){
            System.out.println("july");
        }else if (month == 8){
            System.out.println("august");
        }else if (month == 9){
            System.out.println("september");
        }else if (month == 10){
            System.out.println("october");
        }else if (month == 11){
            System.out.println("november");
        }else if (month == 12){
            System.out.println("december");
        }else{
            System.out.println("Month does not exist");
        }
    }
}
