import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String colour1;
        System.out.print("Enter the first traffic light colour: ");
        colour1 = input.nextLine();
        String colour2;
        System.out.print("Enter the second traffic light colour: ");
        colour2 = input.nextLine();
        String colour3;
        System.out.print("Enter the third traffic light colour: ");
        colour3 = input.nextLine();
        if(colour1.toLowerCase().equals("red")){
            System.out.println("Red: Stop");
        }else if(colour1.toLowerCase().equals("green")){
            System.out.println("Green: Go");
        }else if(colour1.toLowerCase().equals("yellow")){
            System.out.println("Yellow: Reday");
        
        if (colour1.toLowerCase() == colour2.toLowerCase()){
            System.out.println("Colour has already been entered, restart");
            return;
        }

        if(colour2.toLowerCase().equals("red")){
            System.out.println("Red: Stop");
        }else if(colour2.toLowerCase().equals("green")){
            System.out.println("Green: Go");
        }else if(colour2.toLowerCase().equals("yellow")){
            System.out.println("Yellow: Reday");

        if (colour3.toLowerCase() == colour2.toLowerCase() || (colour3.toLowerCase() == colour1.toLowerCase())){
            System.out.println("Colour has already been entered, restart");
            return;
        }
        
        if(colour3.toLowerCase().equals("red")){
            System.out.println("Red: Stop");
        }else if(colour3.toLowerCase().equals("green")){
            System.out.println("Green: Go");
        }else if(colour3.toLowerCase().equals("yellow")){
            System.out.println("Yellow: Reday");
        
        }
    }
}
}
}
