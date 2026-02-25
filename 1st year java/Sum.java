public class Sum {
    public static void main (String[] args) {
        int i = 1, total = 0, even =0, odd = 0;
        while (i <= 100) {
            total = total + i;
        if (i % 2 == 0) {
            even = even + i;
        } else {
            odd = odd + i;
        }
        i++;
    }
    System.out.println("sum of first 100 integers is: " + total);
    System.out.println("sum of even integers is: " + even);
    System.out.println("sum of odd integers is: " + odd);
    }
}
