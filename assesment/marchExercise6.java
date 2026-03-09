package assesment;

public class marchExercise6 {
    public static void main(String [] args){
        for (int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Part B:");
        for (int a = 10; a <= 15 ; a++){
            for(int b = 10; b <= a; b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
