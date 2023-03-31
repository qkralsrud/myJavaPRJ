public class Hw04_01 {
    public static void main(String[] args) {
        int i, k;
        for (i = 0, k = 1; i < 5; k++) {
            System.out.print('*');
            if (k > i) {
                i++;
                k = 0;
                System.out.println();
            }
        }
    }
}
