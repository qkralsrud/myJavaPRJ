public class Lotto_01 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0;i <ball.length;i++){
            ball[i] = i + 1;
        }

        int temp = 0;// 변수 값 교환을 위한 변수
        int j = 0;//랜덤 번호를 저장할 변수

        for (int i = 0; i < 100; i++){
            j = (int) (Math.random() * 45); //난수 발생 -> 랜덤 번호
            //랜덤한 번호의 공과 첫번쨰 공 교환(섞기)
            temp = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }
        //섞기가 끝난 후 앞의 공 6가지 출력
        for (int i = 0; i < 6; i++){
            System.out.println(ball[i]+" ");
        }
    }
}
