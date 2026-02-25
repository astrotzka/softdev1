import java.util.Scanner;
public class classaverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0, grade =0, total = 0;
        System.out.print("Enter a grade (negative number to quit): ");
        grade = input.nextInt();
        while(grade > 0){
            total += grade;
            System.out.print("Enter a grade (negative number to quit): ");
            grade = input.nextInt();
            counter++;
        }
        System.out.println(total + " " + counter);
        System.out.println("Class average is " + (double)(total/counter));

    }
}    