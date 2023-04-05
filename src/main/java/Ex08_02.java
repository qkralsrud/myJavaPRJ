import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {

            System.out.printf(i + 1 + "번째 숫자를 입력하세요 : ");
            aa[i] = s.nextInt();
        }
//        System.out.printf("2번째 숫자를 입력하세요 : ");
//        aa[1] = s.nextInt();
//        System.out.printf("3번째 숫자를 입력하세요 : ");
//        aa[2] = s.nextInt();
//        System.out.printf("4번째 숫자를 입력하세요 : ");
//        aa[3] = s.nextInt();

//        hap = aa[0] + aa[1] + aa[2]+ aa[3];
        for (int i = 0; i < 4; i++) {
            hap += aa[i];
        }
//        hap += aa[0]; //hap = hap + aa[]

        System.out.printf("합계 ==> %d \n", hap);
    }
}
