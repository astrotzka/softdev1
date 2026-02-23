import java.util.Scanner;
public class cubes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int total = 0;
        String output = "";
        System.out.print("Enter a number: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            total += (i * i * i);
            if(i != num){
                output += i + "^3 + ";
            }
        }
        output += num + "^3 = " + total;
        System.out.println(total);
        System.out.println(output);
        input.close();
    }
}
