package assesment;

public class Question5 {
    public static void main(String[] args) {
        //prints the header for part a
        System.out.println("part a:");
        System.out.println("------");
        System.out.println("");

        for(int i = 1; i <= 4; i++){//adds 1 to i as long as i < 5
            for (int j = 1; j <= 5; j++){//adds 1 to j as long as i < 6
                System.out.print("r" + i + "r" + j + " ");//print part a
            }
            System.out.println();//arranges it so its not in a row
        }

        //prints the header for part b
        System.out.println("part b:");
        System.out.println("------");
        System.out.println("");
        for(int i = 4; i <= 4 && i >= 1; i--){//substracts 1 as long as i is lower than 5 and bigger than 0
            for (int j = 5; j <= 5 && j >= 1; j--){//substracts 1 as long as j is lower than 6 and bigger than 0
                System.out.print("r" + i + "r" + j + " ");
            }
            System.out.println();//arranges it so its not in a row
        }
    }
    
}
