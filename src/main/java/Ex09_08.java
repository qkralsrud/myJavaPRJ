public class Ex09_08 {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        //Ip 만 출력하기
        String Ip[]= log.split(" ");
        System.out.println("Ip 만 출력하기 " + Ip[0]); //[]배열의 의미 배열로 만들었으니까 배열의 0번째 자리 출력
        //호출날짜와 시간만 출력하기
//        System.out.println("시간 출력하기 " + Ip[3] + " "+ Ip[4]);
        String time;
        time =Ip[3].replace("[", ""); //Ip[3]배열 자리의 [ 를 대체한다
        System.out.println("시간 : " + time);

    }
}
