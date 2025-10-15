import java.util.Scanner;
public class Form {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        String name;
        String number;
        String email;

         System.out.print("Your name: ");
         name = input.nextLine();

         System.out.print("Your phone number: ");
         number = input.nextLine();

         System.out.print("Your email: ");
         email = input.nextLine();
         
         input.close();

         System.out.println("-====================================-");
         System.out.println("-                ATU                 -");
         System.out.println("-====================================-");
         System.out.printf("- %-34s -%n", "Name:        - " + name);
         System.out.println("--------------------------------------");
         System.out.printf("- %-34s -%n", "Phone Number:- " + number);
         System.out.println("--------------------------------------");
         System.out.printf("- %-34s -%n", "Email:       - " + email);
         System.out.println("--------------------------------------");


    }
}
