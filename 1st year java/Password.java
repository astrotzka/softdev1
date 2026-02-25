import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p = "somepw";
        while(!p.equals("mypass")){
            System.out.print("Enter a password:");
            p = input.nextLine();
        }
        System.out.println("access granted");
    }
}
