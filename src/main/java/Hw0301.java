public class Hw0301 {
    public static void main(String[] args) {
        int i, k;

        for (i = 1; i < 10; i++) {
            for (k = 2; k < 10; k++) {
                System.out.printf("%d X %d = %d \t", k, i, i * k);
            }
            System.out.printf("\n");
        }

    }
}
