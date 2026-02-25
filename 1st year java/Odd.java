public class Odd {
    public static void main(String[] args){
        int i = 1;
        int total = 0;
        for (i = 1; i<= 15; i+=2){
            total += i;    
        }
        System.out.println("total: " + total);
    }
}
