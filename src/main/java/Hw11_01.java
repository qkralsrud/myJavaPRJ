import java.util.Scanner;

public class Hw11_01 {
    public static void main(String[] args) {
        int i,j;

        Scanner s = new Scanner(System.in);

        System.out.printf("몇단? : ");
        j = s.nextInt();

        for (i = 1 ; i<10; i++){
            System.out.printf("%d X %d = %d \n",j,i,j*i);
        }
    }
}


