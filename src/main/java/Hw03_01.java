import java.util.Scanner;

public class Hw03_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;

        System.out.printf("구구단 : ");
        b = s.nextInt();

        for(a = 1;a < 10;a++){
            System.out.printf("%dX%d = %d\n",b,a,b*a);
        }
    }
}
