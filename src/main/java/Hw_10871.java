import java.util.Scanner;

public class Hw_10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int arr[]= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (arr[i] < x){//arr[i]가 x 보다 작을때 출력한다
                System.out.printf("%d ",arr[i]);
            }
        }





    }
}
