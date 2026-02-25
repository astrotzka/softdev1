import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "";
        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
        System.out.print("Enter some text: ");
        text = input.nextLine();
        for (int i = 0; i < text.length(); i++){
            if(text.toLowerCase().charAt(i) == 'a' && aCount == 0){
                aCount++;
                System.out.println("a");
            }
            if(text.toLowerCase().charAt(i) == 'e' && eCount == 0){
                eCount++;
                System.out.println("e");
            }
            if(text.toLowerCase().charAt(i) == 'i' && iCount == 0){
                iCount++;
                System.out.println("i");
            }
            if(text.toLowerCase().charAt(i) == 'o' && oCount == 0){
                oCount++;
                System.out.println("o");
            }
            if(text.toLowerCase().charAt(i) == 'u' && uCount == 0){
                uCount++;
                System.out.println("u");
            }
        }
    }
}
