public class Hw09_02 {
    public static void main(String[] args) {
        int i, k, j;
        for (i = 1; i <= 5; i++) {
            for (k = 5 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

