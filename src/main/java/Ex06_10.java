public class Ex06_10 {
    public static void main(String[] args) {
        int i, k;

        for(i = 2; i < 10; i++){
            for(k = 1; k <10; k++){
                System.out.printf("%d X %d = %d \n", i, k, i*k);
            }
            System.out.printf("99단 끝~");
        }
    }
}