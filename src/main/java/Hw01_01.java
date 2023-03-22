import java.util.Scanner;

public class Hw01_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt();

        if (a % 3 == 0){
            System.out.printf("3의 배수 입니다. \n");
        }



    }
}
