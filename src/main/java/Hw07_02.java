import java.util.Scanner;

public class Hw07_02 {
    public static void main(String[] args) {
        int a;
        int hap;
        int i=0;

        Scanner s = new Scanner(System.in);
        System.out.printf("a 숫자를 입력하세요");
        a =s.nextInt();

        for (hap =1 ; hap <= a;hap++){
             i = hap +i; //i+=hap
        }
//        while(hap>a){
//          hap= 1 + a;
//        }
        System.out.printf("1부터 a 까지의 합 : %d",i);
    }
}
