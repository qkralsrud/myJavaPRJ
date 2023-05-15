import java.util.Scanner;

public class Hw_10952 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a, b;

        for (int i=0;i>=0;i++){
            a = s.nextInt();
            b = s.nextInt();
            if (a==0 && b==0){
                break;
            }
            System.out.printf("%d\n",a+b);
        }
    }
}
