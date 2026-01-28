public class Increment {
    public static void main (String[] args){
        int number = 10;
        System.out.println("Number b4 incr: " + number);
        System.out.println("post incr: " + number++);
        System.out.println("Number after incr: " + number);
        number = 10;
        System.out.println("Number b4 incr: " + number);
        System.out.println("post incr: " + ++number);
        System.out.println("Number after incr: " + number);
        number = 10;
        System.out.println("Number b4 incr: " + number);
        System.out.println("post incr: " + number--);
        System.out.println("Number after incr: " + number);
        number = 10;
        System.out.println("Number b4 incr: " + number);
        System.out.println("post incr: " + --number);
        System.out.println("Number after incr: " + number);
    }
}