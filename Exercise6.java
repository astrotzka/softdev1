import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int side1, side2, side3;
        System.out.println("Enter lenghts for 3 sdies of triangle: ");
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();
        if((side1 == side2) && (side1 == side3)){
            System.out.println("equilateral");
        }else if((side1 == side2) || (side1 == side3) || (side2 == side3)){
            System.out.println("iscoceles");
        }else{
            System.out.println("Scalene");
        }input.close();
    }
}
