package assesment;

public class Question6 {
    public static void main(String[] args) {
        //prints the header for part a
        System.out.println("part a:");
        System.out.println("------");
        System.out.println("");
        for(int i = 1; i <= 4; i++){//adds 1 to i as long as i < 5
            System.out.print("Line " + i + ": ");//prints which line it is
            for (int j = 1; j <= 4; j++){//adds 1 to j as long as i < 5
                System.out.print(j + " ");//prints the numbers
            }
            System.out.println();//arranges it so its not in a row
        }

        //prints the header for part b
        System.out.println("part b:");
        System.out.println("------");
        System.out.println("");
        for(int i = 4; i <= 4 && i >= 1; i--){//substracts 1 as long as i is lower than 5 and bigger than 0
            System.out.print("Line " + i + ": ");//prints which line it is
            for (int j = 4; j <= 4 && j >= 1; j--){//substracts 1 as long as j is lower than 5 and bigger than 0
                System.out.print(j + " ");//prints the numbers
            }
            System.out.println();//arranges it so its not in a row
        }
    }
}
