public class Ex06_12 {
    public static void main(String[] args) {
        int i, k;

        for(i = 2, k = 1 ; i < 10; k++){
                System.out.printf("%d X %d = %d \n", i, k, i*k);
            if (k > 8) { //초깃값이 i가 2 k가 1 ,조건 i < 10 트루 프린트 하고
                i++;    // if 조건 확인 >>거짓 이니까 위로 올라가서 k++ 증감실행
                k = 0; //계속 if 확인 하면서 참일때 i++실행 k= 0
            }
        }
    }
}

