import java.util.Scanner;
public class rectangle {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        int num1 = 0, num2 = 0;
        String unit;

        System.out.print("Enter lenght of the rectangle: ");
        num1 = input.nextInt();

        System.out.print("Enter width of the rectangle: ");
        num2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter unit of measurments of the rectangle: ");
        unit = input.nextLine();

        System.out.println("Area of rectangle is " + (num2 * num1) + " " + unit + " squared");

        input.close();

    }
    
}