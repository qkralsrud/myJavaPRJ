import java.util.Scanner;

public class Hw05_02 {
    public static void main(String[] args){
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.printf("곱 할수를 넣으시오");
        a=s.nextInt();
        System.out.printf("두번쨰로 곱 할수를 넣으시오");
        b=s.nextInt();

        System.out.printf("%d\n",a*(b%10));
        System.out.printf("%d\n",a*((b%100)/10));
        System.out.printf("%d\n",a*(b/100));
        System.out.printf("%d\n",a*b);




    }
}
