import java.util.Scanner;

public class Hw14_02 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int b = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (b == arr[i]){
                count++;
            }
        }
        System.out.printf("%d",count);
    }
}
