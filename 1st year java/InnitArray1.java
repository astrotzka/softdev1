public class InnitArray1 {
    public static void main(String[] args) {
        int[] x = new int[10];
        System.out.println("Index\tValue\n");

        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "\t" + x[i]);
        }

        for (int i = 0, val = 1; i < x.length; i++, val++){
            x[i] = val;

        }
        System.out.println("Index\tValue\n");
        for (int i = 0; i < x.length; i++) {
            System.out.println(i + "\t" + x[i]);
        }
        int[] y = {10, 20, 30, 40};
        System.out.println("\nIndex\tValue\n");
        for (int i = 0; i < y.length; i++) {
            System.out.println(i + "\t" + y[i]);
        }
        
    }
}