import java.util.Scanner;

public class Hw11_03 {
    public static void main(String[] args) {

        int t;
        int hap=0;

        Scanner s =new Scanner(System.in);
        t=s.nextInt();

        for (int i =0; i<=t;i++){
            hap +=i;
        }
        System.out.printf("%d",hap);


    }
}
