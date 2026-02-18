import java.util.Scanner;
public class slae {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double gross = 0, earnings = 0, total = 0;
        int qty = 0;
        String output = "";
        output += "------------------------------\n";
        output += "Item\t\tSold\tTotal\n";
        output += "------------------------------\n";
        for(int i = 1; i <= 4; i++){
            System.out.print("Enter the amount sold of items " + i + ": ");
            qty = input.nextInt();
            total = 0;
            if(i == 1){
                total = qty * 239.99;
                gross += total;
            }else if(i == 2){
                total = qty * 129.75;
                gross += total;
            }else if(i == 3){
                total = qty * 99.96;
                gross += total;
            }else{
                total = qty * 350.89;
                gross += total;
            }
            output += "Item " + i + "\t" + qty + "\t" + Math.round(total) + "\n";
        }
        System.out.println(output);
         output += "------------------------------\n";
         output += "Total: \t\t\t" + Math.round(gross) + "\n";
         output += "------------------------------\n";
         output += "Tearnings \t\t" + Math.round(gross*0.09 + 200) + "\n";
        System.out.println(output);
        //System.out.println("earnings this week: " + Math.round(gross * 0.09 + 200));

    }
}
