import java.util.Scanner;
public class NinthLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int st = 1;
        double grade = 0;
        int clas = 0;
        double avg = 0;
        System.out.print("Enter number of students: ");
        clas = input.nextInt();
        while (st <= clas) {
            System.out.print("Enter grade for student " + st + ": ");
            grade += input.nextInt();
            st += 1;
        }System.err.println("total class grade: " + grade);
        avg = (grade / clas);
        System.out.println("average class grade: " + avg);
    }
}
