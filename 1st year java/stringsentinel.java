import java.util.Scanner;
public class stringsentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp;
        System.out.print("type anything, or type 'quit' to exit");
        do{
            System.out.println("Enter text: ");
            inp = input.nextLine();
            if(!inp.equalsIgnoreCase("quit")){
                System.out.println("You typed " + inp);
            }
        }while(!inp.equalsIgnoreCase("quit"));
    }
    
}
