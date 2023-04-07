import java.util.Scanner;

public class Hw08_01 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i;
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.printf("%d번쨰 숫자를 입력하시오(중복X) : ", i+1);
            arr[i] = s.nextInt();
            for (int b = 0; b<i ; b++) {    //b는 중복이 안되게 끔 하는 변수로 설정
                if (arr[i] == arr[b]){      //만약에 arr[i]의 입력값과 arr[b]의 입력값이 같다면
                    System.out.printf("중복되었으므로 다시 입력하세요 ");
                    i--;        //i-1 을 하고 위로 올라가서 다시 반복할때 i+1 이되니까 arr[i]를 다시 입력
                }
            }
        }
        for (int k = 0; k < 4; k++) {                   //k 는 k번째 자리수의 배열(정렬하는거? 회전횟수)
            for (int j = k + 1; j < 5; j++) {       //k랑 j랑 비교를 해야되 k랑 j는 배열자리
                if (arr[k] > arr[j]) {              //그래서 j 는 k+1 이되야되, 왜냐면 자리수 끼리 비교할꺼니까 k는 배열의 0번쨰 자리 j는 배열의 1번쨰 자리부터 시작
                    int temp = arr[k];              //if 자체가 arr 배열의 k번쨰 자리 j번째 자리 비교하는거
                    arr[k] = arr[j];                //arr[k]가 대입하면서 비교할때 값이 사라지지않도록 temp 를 하나더 지정.
                    arr[j] = temp;                  //arr[k]값이 저장된 temp 를 arr[j]에 대입
                }                                   //arr[k]는 이미 arr[j]가 대입되었고, k가 대입되었던 temp 가 j에 대입

            }
        }
        for (int a = 0; a < 5; a++)                 //배열의 값은 이미 위의 for 문에 정렬되어 저장되있고 이쪽 for 는
            System.out.printf("%d", arr[a]);        //정렬된 배열을 출력을 위한 반복 for
    }
}
