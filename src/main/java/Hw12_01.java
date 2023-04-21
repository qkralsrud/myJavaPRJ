import java.util.Scanner;

public class Hw12_01 {
    public static void main(String[] args) {
        int arr[]=new int[5]; //배열 선언
        Scanner s = new Scanner(System.in);

        System.out.printf("입력 값 : ");
        for ( int i=0; i<5;i++){ //입력 값 반복
            arr[i]=s.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){ //내림차순 정렬
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i< arr.length;i++)
        System.out.printf(" %d ",arr[i]);


    }
}
