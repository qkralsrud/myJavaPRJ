import java.util.Scanner;

public class Hw_24392439 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int i, k, j, count;

        count = s.nextInt();
        for (i=0;i<count;i++){
            for (k=count-i;k>1;k--){
                System.out.printf(" ");
            }
            for (j=count-i;j<count+1;j++){
                System.out.printf("*");
            }
        System.out.println();
        }
    }
}
