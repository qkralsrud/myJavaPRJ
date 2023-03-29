import java.util.Scanner;

public class Hw09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t;
        System.out.printf("반복 횟수: ");
        t = s.nextInt();
        for (int i = 0;i < t;i++){
            int a , b;
            System.out.printf("첫번째 숫자입력");
            a = s.nextInt();
            System.out.printf("두번째 숫자입력");
            b = s.nextInt();
            System.out.printf("%d\n",a+b);
        }
        System.out.printf("연산 끝");

    }
}
