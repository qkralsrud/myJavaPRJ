import java.util.Scanner;

public class Hw10_01 {
    public static void main(String[] args) {
        int arr[]=new int[5]; //배열 선언
        int hap=0;
        float average;

        Scanner s= new Scanner(System.in);
        System.out.printf("입력값 : ");
        for (int i=0 ; i<arr.length; i++){ //배열의 입력값 반복 for
            arr[i]=s.nextInt();
        }

        int max=arr[0]; //배열의 최대 최소의 초기값 선언
        int min= arr[0];

        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){//배열의 0번째를 맥스로 설정하고 배열의 i 번째가 맥스보다 크면 비교를 해서 그값이 맥스가 되게 설정
                max=arr[i];
            }
            if (arr[i]<min){/*배열의 0번째를 미니로 설정하고 배열의 i 번째가 미니보다 작으면 비교를 해서 그값이 미니가 되게 설정*/
                min=arr[i];
            }
        }
        System.out.printf("최소값 : %d\n",min);
        System.out.printf("최대값 : %d\n",max);

        for (int i =0; i< arr.length; i++){ //배열들의 합을 구하는 반복 for
            hap+=arr[i];
        }
        average=hap/(float)5;
        System.out.printf("평균값 : %f",average);
    }
}
