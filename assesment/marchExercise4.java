package assesment;

public class marchExercise4 {
    public static void main(String[]args){
        int num = 20;
        int sum = 0;
        while (num >= 11 && num <= 20 && num % 2 == 0){
            sum += num;
            System.out.print(num + " + ");
            num -= 2;
            if(num == 10){
                sum += num;
                System.out.println(num + " = " + sum);
            }
        }
    }
    
}
