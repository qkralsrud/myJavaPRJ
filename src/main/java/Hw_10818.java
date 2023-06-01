import java.util.Scanner;

public class Hw_10818 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int [n];

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.printf("%d %d",min ,max);

    }
}
