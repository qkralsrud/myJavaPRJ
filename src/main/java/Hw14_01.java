import java.util.Scanner;

public class Hw14_01 {
    public static void main(String[] args) {
        int a,b ,c;
        Scanner s =new Scanner(System.in);

        c =s.nextInt();
        for (int i = 0; i<c; i++){
            a = s.nextInt();
            b = s.nextInt();
            System.out.printf("%d\n",a+b);
        }

    }
}
