import java.util.Scanner;

public class Hw06_02 {
    public static void main(String[] args) {

    int a, b, c;
        Scanner s =new Scanner(System.in);
        System.out.printf("a, b, c의 수를 입력하시오.");
        a= s.nextInt();
        b= s.nextInt();
        c= s.nextInt();

        System.out.printf("%d\n", (a+b)%c);
        System.out.printf("%d\n", ((a%c) + (b%c))%c);
        System.out.printf("%d\n", (a*b)%c);
        System.out.printf("%d\n", ((a%c) * (b%c))%c);

    }
}
