import java.util.Scanner;
public class wages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hoursworked = 0;
        double hourlywage = 0;
        System.out.print("Enter the number of hours worked: ");
        hoursworked = input.nextDouble();
        System.out.print("Enter the hourly wage: ");
        hourlywage = input.nextDouble();
        if (hoursworked >= 40) {
            double overtimeHours = hoursworked - 40;
            hoursworked = 40 + (overtimeHours * 1.5);
        }

        double totalWages = hoursworked * hourlywage;
        System.out.println("Total wages for the week: " + totalWages);
    }
}
