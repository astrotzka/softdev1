import java.util.Scanner;
public class Grades1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1, grade = 0, total = 0;
        double avg = 0;
        while(num <= 10){
            System.out.print("Enter grade " + num + ": ");
            grade = input.nextInt();
            total += grade;
            num++;
            
        }
        avg = total/10.0;
        System.out.println("Average grade is " + avg);
    }
}
