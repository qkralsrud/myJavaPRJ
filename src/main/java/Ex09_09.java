import java.util.Scanner;

public class Ex09_09 {
    public static int coffee_machine(int button) { //커피 자판기 메소드 구현
        System.out.printf("\n# 1.(자동으로)뜨거운 물을 준비한다\n");
        System.out.printf("# 2.(자동으로)종이컵을 준비한다\n");

        switch (button) {
            case 1:
                System.out.printf("# 3.(자동으로) 보통커피를 탄다\n");
                break;
            case 2:
                System.out.printf("# 3.(자동으로) 설탕커피를 탄다\n");
                break;
            case 3:
                System.out.printf("# 3.(자동으로) 블랙커피를 탄다\n");
                break;
            default:
                System.out.printf("# 3.(자동으로) 아무거나 탄다\n");
                break;

        }
        System.out.printf("# 4.(자동으로) 물을 붓는다\n");
        System.out.printf("# 5.(자동으로) 스푼으로 저어서 녹인다\n\n");

    return 0; //33행으로 간다
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee; //커피종류 변수와 반환 값 변수 선언
        int ret;

        System.out.printf("어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
        coffee = s.nextInt(); //커피 주문 받기

        ret = coffee_machine(coffee); //커피 자판기의 버튼 누른다(coffee_machine()메소드 호출)

        System.out.printf("커피 여기 있습니다.\n");
    }

}
