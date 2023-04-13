import java.util.Scanner;

public class Hw11_02 {
    public static void main(String[] args) {
        int a,b,t;

        System.out.printf("반복 횟수 : ");
        Scanner s = new Scanner(System.in);

        t = s.nextInt();
        for (int i=0; i< t ; i++){
            a = s.nextInt();
            b = s.nextInt();
            System.out.printf("%d + %d = %d\n", a , b, a+b);
        }
    }
}
