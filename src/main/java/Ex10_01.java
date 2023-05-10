public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try{
            aa[2] = 100/ 0; // 숫자를 영으로 나눌수 없기에 에러
            aa[3] =100; //aa[2]까지 배열의 칸이 존재함 에러
//        } catch (ArrayIndexOutOfBoundsException e){ //에러 명
//            System.out.println("배열 첨자가 배열 크기보다 커요 ~");
//            System.out.println("오류 메세지 : " + e);
////        } catch (ArithmeticException e){
//            System.out.println("0으로 나누는 등의 오류예요 ~~");
//            System.out.println("오류 메세지 : " + e);
        }catch (Exception e){
            System.out.println("자바에서 발생되는 오류는 다 잡을수 있어요"); //모든 에러를 잡아줄 수있는 코드 는 가장 밑에 있어야 한다
            System.out.println("오류 메세지 : " + e);
        }finally {
            System.out.println("이 부분은 무조건 나와요 ~~"); //finally는 무조건 실행
        }
    }
}
