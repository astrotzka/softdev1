import java.util.Scanner;
public class Grades2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1, grade = 0, total = 0;
        double avg = 0;
        while(grade != -1){
            System.out.print("Enter grade " + num + " (-1 to quit): ");
            grade = input.nextInt();
            if(grade != -1)
                total += grade;
            num++;
            
        }
        avg = total/(double)(num - 2);
        System.out.println("Average grade is " + avg);
    }
}
