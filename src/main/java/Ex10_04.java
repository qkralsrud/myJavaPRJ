public class Ex10_04 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try{
            if (b==0)
                throw new Exception("0으로 나누려고요? 안됩니다."); //메모리에 올려라 에러라는 객체를 올려라
            result = a/ b;
        } catch (Exception e){ //에러가 났으니 잡는다. e 는 위에 에러메세지 적은거 의미함.
            System.out.print("발생 오류 ==> ");
            System.out.println(e.getMessage());
        }
    }
}
